class Arithmetic{

    int add(int a, int b){
        return a+b;
    }
}
class Adder extends Arithmetic{

    void display(){
        System.out.println("My superclass is Arithmetic");
    }
}

public class Tester_qn6 {
    public static void main(String[] args){
        Adder a = new Adder();
        a.display();
        int sum = a.add(5,6);
        System.out.println(sum);
    }
}
