class Animal {
    public int legs;
    public String color;

    public Animal(int legs, String color) {
        this.legs = legs;
        this.color = color;
    }

    public void talk() {
        System.out.println("Any animal can talk.");
    } 
}

class Human extends Animal {
    private String Name;
    private int age;

    public Human(String color, String Name, int age) {
        super(2 , color);
        this.age = checkAge(age);
        this.Name = Name;
    }

    public int checkAge(int age) {
        if (age <= 100) {
            return age;
        } else {
            System.out.println("Age is not valid. Setting to default value of 0.");
            return 0;
        }
    }

    public void setAge(int age) {
        this.age = checkAge(age);
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    @Override
    public void talk() {
        System.out.println("Human can talk.");
    }
}

class Dog extends Animal {
    private int age;

    public Dog(int legs, String color, int age) {
        super(legs, color);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void talk() {
        System.out.println("Dog Can bark");
    }
}

class BullDog extends Dog {
    private String petName;

    public BullDog(int legs, String color, int age, String petName) {
        super(legs, color, age);
        this.petName = petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human("fair", "Alice", 25);
        Dog dog = new Dog(4, "brown", 5);
        BullDog bulldog = new BullDog(4, "white", 3, "Max");

        System.out.println("Human: " + human.getName() + ", Age: " + human.getAge());
        human.talk();

        System.out.println("Dog Age: " + dog.getAge());
        dog.talk();

        System.out.println("BullDog Name: " + bulldog.getPetName() + ", Age: " + bulldog.getAge());
        bulldog.talk();
    }
}
