class Mobile {
    double height;
    double weight;
    double cameraQuality;
    String modelName;
    String color;
    String operatingSystem;

    public Mobile(String modelName, String color, double height, double weight, double cameraQuality, String operatingSystem) {
        this.modelName = modelName;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.cameraQuality = cameraQuality;
        this.operatingSystem = operatingSystem;
    }

    public void makeCall() {
        System.out.println("Making a call using the mobile phone...");
    }

    public void sendMessage() {
        System.out.println("Sending a text message...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with " + cameraQuality + "MP camera.");
    }
}

class Iphone extends Mobile {
    String aiModel;
    int cloudStorage;

    public Iphone(String modelName, String color, double height, double weight, double cameraQuality, String operatingSystem, String aiModel, int cloudStorage) {
        super(modelName, color, height, weight, cameraQuality, operatingSystem);
        this.aiModel = aiModel;
        this.cloudStorage = cloudStorage;
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call using FaceTime on iPhone.");
    }

    public void useSiri() {
        System.out.println("Using Siri with AI model: " + aiModel);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("GenericModel", "Black", 6.0, 150, 12, "Android");
        mobile.makeCall();
        mobile.sendMessage();
        mobile.takePhoto();

        Iphone iphone = new Iphone("iPhone 14", "Silver", 6.1, 170, 48, "iOS", "A16 Bionic", 512);
        iphone.makeCall(); // Overridden method
        iphone.useSiri();
        iphone.takePhoto(); // Inherited method
    }
}
