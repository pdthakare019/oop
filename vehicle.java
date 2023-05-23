import java.util.*;
abstract class Mode{
    abstract void move();
}
class helicopter extends Mode{
    @Override
    void move() {
        System.out.println("Airways");
    }
}
class car extends Mode{
    @Override
    void move() {
        System.out.println("Raodways");
    }
}
class train extends Mode{
    @Override
    void move() {
        System.out.println("Railways");
    }
}

public class vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {


            System.out.println("Enter the vehicle\n1. Helicopter\n2. Car\n3. Train");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Mode helicop = new helicopter();
                    helicop.move();
                    break;
                case 2:
                    Mode car = new car();
                    car.move();
                    break;
                case 3:
                    Mode train = new train();
                    train.move();
                    break;
                default:
                    System.out.println("Invlaid choice press 0 to continue");
                    choice =sc.nextInt();
            }
        }while(choice==0);
        sc.close();
    }
}
