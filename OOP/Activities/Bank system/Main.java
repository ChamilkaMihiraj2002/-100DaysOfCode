abstract class Account {
    private static int accountCount = 0; // Static counter for accounts
    private String accountNumber;
    private String name;
    private int age;

    private double credit;
    private double debit;
    private double rate = 1.5;

    public Account(String accNo, String name, int age) {
        this.age = age;
        this.accountNumber = accNo;
        this.name = name;
        accountCount++;
    }

    public void deposit(double value) {
        this.credit += value;
    }

    public void withdraw(double value) {
        this.debit += value;
    }

    public double getBalance() {
        return credit - debit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNumber(String accNo) {
        this.accountNumber = accNo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getRate() {
        return rate;
    }

    protected void updateRate(double rate) {
        this.rate = rate;
    }

    public abstract void setRate(double rate);

    public static int getAccountCount() {
        return accountCount;
    }
}

class Savings extends Account {
    public Savings(String accNo, String name, int age) {
        super(accNo, name, age);
    }

    @Override
    public void setRate(double rate) {
        updateRate(rate);
    }
}

class ChildrenAccounts extends Savings {
    public ChildrenAccounts(String accNo, String name, int age) {
        super(accNo, name, validateAge(age));
    }

    private static int validateAge(int age) {
        if (age > 18) {
            throw new IllegalArgumentException("Age must be 18 or younger for a Children's Account.");
        }
        return age;
    }

    @Override
    public void setRate(double rate) {
        updateRate(rate);
    }

    public void presents() {
        if (this.getBalance() >= 5000) {
            System.out.println(this.getName() + ", you have a big present.");
        }
    }
}

class AdultsAccount extends Savings {
    public AdultsAccount(String accNo, String name, int age) {
        super(accNo, name, age);
    }

    @Override
    public void setRate(double rate) {
        updateRate(rate);
    }

    public void checkForFixed() {
        if (this.getBalance() > 50000) {
            System.out.println(this.getName() + ", you can create a fixed deposit now.");
        }
    }
}

class OldPersonsAccounts extends Savings {
    public OldPersonsAccounts(String accNo, String name, int age) {
        super(accNo, name, age);
    }

    @Override
    public void setRate(double rate) {
        updateRate(rate);
    }

    public void checkForFixed() {
        if (this.getBalance() > 50000) {
            System.out.println(this.getName() + ", you can create a fixed deposit now.");
            this.setRate(8);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create accounts for different types
        ChildrenAccounts childAcc = new ChildrenAccounts("CH123", "Tom", 12);
        AdultsAccount adultAcc = new AdultsAccount("AD456", "Alice", 35);
        OldPersonsAccounts oldAcc = new OldPersonsAccounts("OL789", "Bob", 65);

        // Deposit money
        childAcc.deposit(6000);
        adultAcc.deposit(60000);
        oldAcc.deposit(70000);

        // Check account-specific functionality
        childAcc.presents();
        adultAcc.checkForFixed();
        oldAcc.checkForFixed();

        // Display total accounts created
        System.out.println("Total Accounts Created: " + Account.getAccountCount());
    }
}
