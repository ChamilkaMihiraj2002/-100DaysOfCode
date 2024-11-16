class Mobile {
    String modelName;
    double price;

    public void displayInfo() {
        System.out.println("Model: " + modelName + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(); // Default constructor called

        mobile.modelName = "Samsung";
        mobile.price = 250.75;

        mobile.displayInfo();
    }
}
