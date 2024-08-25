import java.util.Scanner;

class Student {
    private String indexNumber;
    private double gpa;
    private String name;
    private int age;

    Student(String indexNumber, double gpa, String name, int age) {
        this.indexNumber = indexNumber;
        this.gpa = gpa;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setIndexNumber(String index) { this.indexNumber = index; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getIndexNumber() { return indexNumber; }
    public double getGpa() { return gpa; }
}

class Undergraduate extends Student {
    private String department;

    Undergraduate(String indexNumber, double gpa, String name, int age, String department) {
        super(indexNumber, gpa, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Postgraduate extends Student {
    private String research;

    Postgraduate(String indexNumber, double gpa, String name, int age, String research) {
        super(indexNumber, gpa, name, age);
        this.research = research;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.println("Enter " + prompt + ":");
        return scanner.nextLine();
    }

    public int getInt(String prompt) {
        System.out.println("Enter " + prompt + ":");
        return scanner.nextInt();
    }

    public double getDouble(String prompt) {
        System.out.println("Enter " + prompt + ":");
        return scanner.nextDouble();
    }

    public void run() {
        // Array to store  students
        Student[] students = new Student[3];

        // Loop to get details for  students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            // Gather common details
            String name = getString("Name");
            int age = getInt("Age");
            scanner.nextLine(); // consume newline
            String indexNumber = getString("Index Number");
            double gpa = getDouble("GPA");
            scanner.nextLine(); // consume newline

            System.out.println("Are you an Undergraduate or Postgraduate?");
            String studentType = scanner.nextLine().trim().toLowerCase();

            if (studentType.equals("undergraduate")) {
                String department = getString("Department");
                students[i] = new Undergraduate(indexNumber, gpa, name, age, department);
                System.out.println("Undergraduate Student Created.");
            } else if (studentType.equals("postgraduate")) {
                String research = getString("Research Topic");
                students[i] = new Postgraduate(indexNumber, gpa, name, age, research);
                System.out.println("Postgraduate Student Created.");
            } else {
                System.out.println("Invalid student type entered.");
                i--; // Retry the current student if an invalid type is entered
            }
        }

        // Display details of all students
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() +
                    ", Index Number: " + student.getIndexNumber() + ", GPA: " + student.getGpa());
            if (student instanceof Undergraduate) {
                System.out.println("Department: " + ((Undergraduate) student).getDepartment());
            } else if (student instanceof Postgraduate) {
                System.out.println("Research: " + ((Postgraduate) student).getResearch());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }
}
