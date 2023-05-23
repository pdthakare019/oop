import java.util.Scanner;

interface Account {
    void set(String accountNumber, double balance);
    void display();
}

interface User {
    void store(String name);
    void disp();
}

class Customer implements Account, User {
    private String name;
    private String accountNumber;
    private double balance;

    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Name: " + name);
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming interest rate of 5%
        System.out.println("Interest: " + interest);
    }
}

public class interface_inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        customer.store(name);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        customer.set(accountNumber, balance);

        System.out.println("\nCustomer Information:");
        customer.disp();
        customer.display();
        customer.calculateInterest();
    }
}
