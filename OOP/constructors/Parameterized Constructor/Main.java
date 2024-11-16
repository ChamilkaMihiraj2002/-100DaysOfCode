class Mobile {
    String modelName;
    double price;

    // Parameterized constructor
    public Mobile(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Model: " + modelName + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Galaxy S21", 799.99); // Parameterized constructor called
        mobile.displayInfo();
    }
}
