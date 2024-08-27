import java.util.Scanner;
import java.util.ArrayList;

class Course {
    private String courseName;
    private double credit;

    Course(String cName, double credit) {
        this.courseName = cName;
        this.credit = setCredit(credit);
    }

    void setCourseName(String data) {
        this.courseName = data;
    }

    double setCredit(double data) {
        if (data <= 3.0) {
            return data;
        } else {
            System.out.println("-- Credit does not match the limit --");
            return 0; // Default to 0 if credit exceeds the limit
        }
    }

    double getCredit() {
        return this.credit;
    }

    String getCourseName() {
        return this.courseName;
    }

    // Override toString() to provide meaningful information about the course
    @Override
    public String toString() {
        return "Course Name: " + this.courseName + ", Credit: " + this.credit;
    }
}

class Student {
    private static int countOfStudents = 0;  // Static to share among all instances
    private String name;
    private Course course;

    Student(Course course, String Rname) {
        this.course = course;
        this.name = Rname;
        setStudentCount();
    }

    void setStudentCount() {
        countOfStudents++;  // Increment the static count
    }

    void setName(String data) {this.name = data;}

    static int getCountOfStudents() {
        return countOfStudents;  // Return static count
    }

    Course getCourse() {
        return this.course;
    }

    String getName() {return this.name;}
}

class Teacher {
    private String name;
    private int id;
    private ArrayList<Course> coursesTaught;  // A list to store courses taught by the teacher

    // Constructor
    Teacher(String name, int id) {
        this.name = name;
        this.id = id;
        this.coursesTaught = new ArrayList<>();
    }

    // Method to assign a course to the teacher
    void assignCourse(Course course) {
        coursesTaught.add(course);
    }

    // Method to display teacher information
    void displayTeacherInfo() {
        System.out.println(" ");
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + id);
        System.out.println("Courses Taught:");
        for (Course course : coursesTaught) {
            System.out.println("- " + course.getCourseName());
        }
    }

    // Getter and Setter methods for name and id (optional)
    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Graphic Design", 3.0);
        Course c2 = new Course("Web Development", 3.0);

        // Students are enrolled in courses
        Student std1 = new Student(c1, "Amila Sampath");
        Student std2 = new Student(c2, "kamal Bandara");
        Student std3 = new Student(c1, "Saman Perera"); // Another student for the same course

        System.out.println("Total number of students: " + Student.getCountOfStudents());

        // This will now print meaningful course information
        System.out.println("Student name : " + std1.getName() + " | " + std1.getCourse());

        // Create a teacher and assign courses
        Teacher teacher1 = new Teacher("John Doe", 101);
        teacher1.assignCourse(c1);
        teacher1.assignCourse(c2);

        // Display teacher information
        teacher1.displayTeacherInfo();
    }
}
