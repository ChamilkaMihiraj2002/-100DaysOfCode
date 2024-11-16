class Mobile {
    String modelName;
    double price;

    // Parameterized constructor
    public Mobile(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    // Copy constructor
    public Mobile(Mobile other) {
        this.modelName = other.modelName;
        this.price = other.price;
    }

    public void displayInfo() {
        System.out.println("Model: " + modelName + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile original = new Mobile("iPhone 14", 999.99);
        Mobile copy = new Mobile(original); // Copy constructor called

        original.displayInfo();
        copy.displayInfo();
    }
}
