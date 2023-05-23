import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Person {
    private String designation;
     double salary;

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
public class employee_inheritance {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 5 employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].input();
        }

        System.out.println("\nEmployees with salary greater than 5000:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > 5000) {
                employees[i].display();
                System.out.println();
            }
        }
    }
}