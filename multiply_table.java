import java.util.*;
public class multiply_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }

        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                System.out.println("Not prime");
                break;
            }
            else {
                System.out.println("Prime");
                break;
            }
        }
        sc.close();
    }
}
