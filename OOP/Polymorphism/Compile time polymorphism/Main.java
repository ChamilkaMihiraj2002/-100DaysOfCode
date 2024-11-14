class Adder {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double add(double x, double y, double z) {
        return x + y + z;
    }
}

public class Main {
    public static void main(String[] args) {
        Adder one = new Adder();
        System.out.println(one.add(10, 20));

        Adder two = new Adder();
        System.out.println(two.add(10, 20, 30));

        Adder three = new Adder();
        System.out.println(three.add(10.50, 20.5));

        Adder four = new Adder();
        System.out.println(four.add(10.5, 20.5, 30.5));
    }
}
