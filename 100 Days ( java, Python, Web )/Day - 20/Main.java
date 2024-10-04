import java.util.Scanner;

class Student {
    private String indexNumber;
    private String NIC;
    public String name;
    public int age;
    public String address;

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getNIC() {
        return NIC;
    }

    public void setAge(int age) {
        if (age > 30) {
            System.out.println("You are not allowed to apply for the courses");
        } else {
            this.age = age;
        }
    }

    public int getAge() { return age; }

    public void setAddress(String address) { this.address = address; }

    public String getAddress() { return address; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setIndexNumber(String indexNumber) { this.indexNumber = indexNumber; }

    public String getIndexNumber() { return indexNumber; }

    Student(String index_, String nic_, String name_, String address_, int age_) {
        setAge(age_);
        setAddress(address_);
        setNIC(nic_);
        setIndexNumber(index_);
        setName(name_);
    }
}

class Undergraduate extends Student {
    private double gpa;
    private String department;

    Undergraduate(String index_, String nic_, String name_, String address_, int age_, double gpa, String department) {
        super(index_, nic_, name_, address_, age_);
        setDepartment(department);
        setGpa(gpa);
    }

    public void setDepartment(String department) { this.department = department; }

    public String getDepartment() { return department; }

    public void setGpa(double gpa) {
        if (gpa > 4) {
            System.out.println("Invalid GPA!!!");
        } else {
            this.gpa = gpa;
        }
    }

    public double getGpa() { return gpa; }
}

class Postgraduate extends Student {
    private double pgpa;
    private String subject;

    public void setSubject(String subject) { this.subject = subject; }

    public String getSubject() { return subject; }

    public void setPgpa(double pgpa) {
        if (pgpa > 4) {
            System.out.println("Invalid PGPA!!!");
        } else {
            this.pgpa = pgpa;
        }
    }

    public double getPgpa() { return pgpa; }

    Postgraduate(String index_, String nic_, String name_, String address_, int age_, double pgpa_, String subject_) {
        super(index_, nic_, name_, address_, age_);
        setPgpa(pgpa_);
        setSubject(subject_);
    }
}

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static int inputInt(String data) {
        System.out.print(data + ": ");
        while (!reader.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            reader.next(); // clear invalid input
        }
        int value = reader.nextInt();
        reader.nextLine(); // consume newline
        return value;
    }

    public static double inputDouble(String data) {
        System.out.print(data + ": ");
        while (!reader.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            reader.next(); // clear invalid input
        }
        double value = reader.nextDouble();
        reader.nextLine(); // consume newline
        return value;
    }

    public static String inputString(String data) {
        System.out.print(data + ": ");
        return reader.nextLine();
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student number: " + (i + 1) + " details ::");

            String indexNumber = inputString("Index number");
            String NIC = inputString("NIC number");
            String name = inputString("Name");
            String address = inputString("Address");
            int age = inputInt("Age");
            double gpa = inputDouble("GPA");
            String check = inputString("Are you undergraduate or postgraduate").trim().toLowerCase();

            if (check.equals("undergraduate")) {
                String department = inputString("Department");
                students[i] = new Undergraduate(indexNumber, NIC, name, address, age, gpa, department);
                System.out.println("Undergraduate Student Created.");
            } else if (check.equals("postgraduate")) {
                String subject = inputString("Subject");
                students[i] = new Postgraduate(indexNumber, NIC, name, address, age, gpa, subject);
                System.out.println("Postgraduate Student Created.");
            } else {
                System.out.println("Invalid student type entered.");
                i--; // Retry the current student if an invalid type is entered
            }
        }

        reader.close();

        // Display details of all students
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() +
                    ", Index Number: " + student.getIndexNumber() + ", NIC: " + student.getNIC());
            if (student instanceof Undergraduate) {
                System.out.println("Department: " + ((Undergraduate) student).getDepartment());
                System.out.println("GPA: " + ((Undergraduate) student).getGpa());
            } else if (student instanceof Postgraduate) {
                System.out.println("Subject: " + ((Postgraduate) student).getSubject());
                System.out.println("PGPA: " + ((Postgraduate) student).getPgpa());
            }
            System.out.println();
        }
    }
}
