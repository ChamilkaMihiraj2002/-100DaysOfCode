class Shape  {
    public void drawing() {
        System.out.println("Drawing............");
    }
}

class Rectangle extends Shape {
    public void drawing() {
        System.out.println("Drawing a rectangle");
    }
}

class Square extends Shape {
    public void drawing() {
        System.out.println("Drawing a square");
    }
}

class Circle extends Shape {
    public void drawing() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.drawing();

        s = new Square();
        s.drawing();

        s = new Circle();
        s.drawing();
    }
}
