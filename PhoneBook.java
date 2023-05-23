import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        int numEntries = sc.nextInt();
        System.out.println("\n");

        Map<String, String> phoneBook = new HashMap<>();

        for (int i=0;i<numEntries;i++){
            System.out.println("Enter Name:");
            String name = sc.next();
            System.out.println("Enter phone number:");
            String phoneNumber = sc.next();
            phoneBook.put(name,phoneNumber);
        }

        String query = sc.next();
        if (phoneBook.containsKey(query)){
            System.out.println(query + " phone number: " + phoneBook.get(query));
        }
        else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}
