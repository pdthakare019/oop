import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class student_example {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);

        student.addCourse("Mathematics");
        student.addCourse("Science");
        student.addCourse("English");

        student.displayInfo();
        student.displayCourses();

        student.removeCourse("Science");

        System.out.println("\nAfter removing course:");
        student.displayCourses();
    }
}

