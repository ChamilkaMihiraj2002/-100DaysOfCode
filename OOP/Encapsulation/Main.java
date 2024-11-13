

class Person {
    private double id;
    private String name;

    public Person() {
        this.id = Math.ceil((Math.random()* 100));
        Sayhello();
    }

    public void Sayhello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.setName("Ramesh");
        System.out.println(P1.getName());
        Person P2 = new Person();
        Person P3 = new Person();
    }
}
