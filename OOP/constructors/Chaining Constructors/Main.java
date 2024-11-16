class Mobile {
    String modelName;
    double price;

    // Default constructor
    public Mobile() {
        this("Unknown Model", 0.0); // Calling parameterized constructor
    }

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
        Mobile defaultMobile = new Mobile(); // Default constructor called
        Mobile specificMobile = new Mobile("Pixel 7", 599.99); // Parameterized constructor called

        defaultMobile.displayInfo();
        specificMobile.displayInfo();
    }
}
