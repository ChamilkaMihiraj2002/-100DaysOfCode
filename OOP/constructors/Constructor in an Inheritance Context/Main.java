class Mobile {
    String modelName;

    // Constructor of the parent class
    public Mobile(String modelName) {
        this.modelName = modelName;
    }
}

class Iphone extends Mobile {
    String aiModel;

    // Constructor of the child class
    public Iphone(String modelName, String aiModel) {
        super(modelName); // Calls parent class constructor
        this.aiModel = aiModel;
    }

    public void displayInfo() {
        System.out.println("Model: " + modelName + ", AI Model: " + aiModel);
    }
}

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone 15", "A17 Bionic");
        iphone.displayInfo();
    }
}
