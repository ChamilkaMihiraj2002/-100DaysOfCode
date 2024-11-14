interface Animal {
    public void sound();
    public void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Bau bau...");
    }
    public void sleep() {
        System.out.println("Zzz.....");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();
        dog1.sleep();
    }
}
