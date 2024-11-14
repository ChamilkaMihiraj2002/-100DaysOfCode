abstract  class Employee {
    private int EmpID;
    private String Name;
    private int paymentForhours;

    public Employee(int EmpID, String Name, int payment) {
        this.EmpID = EmpID;
        this.Name = Name;
        this.paymentForhours = payment;
    }

    public abstract double CalculateSalary();

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    
    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setPaymentForHours(int hours) {
        this.paymentForhours = hours;
    }

    public int getPaymentForHourse() {
        return paymentForhours;
    }
}

class Contractor extends Employee {
    private int workingHours;

    public Contractor(int EmpID, String Name, int payment, int workingHours) {
        super(EmpID, Name, payment);
        this.workingHours = workingHours;
    }

    @Override
    public double CalculateSalary() {
        return getPaymentForHourse() * workingHours;
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int EmpID, String Name, int payment) {
        super(EmpID, Name, payment);
    }

    @Override
    public double CalculateSalary() {
        return getPaymentForHourse() * 8;
    }
}

public class Main{
    public static void main(String[] args) {
        Employee contractor = new Contractor(1001,"Chamilka", 1200, 10);
        Employee fullTimeEmployee = new FullTimeEmployee(1002, "Mihiraj", 800);

        System.err.println(contractor.CalculateSalary());
        System.out.println(fullTimeEmployee.CalculateSalary());
    }
}