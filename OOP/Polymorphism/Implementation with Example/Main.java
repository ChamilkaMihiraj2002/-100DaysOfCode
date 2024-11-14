interface Payment {
    public void pay();
}

class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("This is Cash payment!");
    }
}

class CreditPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("This is Credit card payment!");
    }
}

public class Main {
    public static void main(String[] args) {
        CashPayment cash1 = new CashPayment();
        cash1.pay();

        Payment payment1 = new CashPayment();
        payment1.pay();

        payment1 = new CreditPayment();
        payment1.pay();
    }
}