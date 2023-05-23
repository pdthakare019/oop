abstract class Marks{
    abstract void getPercentage();
}
class A extends Marks{
    int marks_a1, marks_a2, marks_a3;
    A(int marks_a1, int marks_a2, int marks_a3){
        this.marks_a1= marks_a1;
        this.marks_a2= marks_a2;
        this.marks_a3= marks_a3;
    }
    @Override
    void getPercentage() {
        int result= ((marks_a1+marks_a2+marks_a3)*100)/(300);
        System.out.println(result);
    }
}
class B extends Marks{
    int marks_b1, marks_b2, marks_b3;
    B(int marks_b1, int marks_b2, int marks_b3){
        this.marks_b1= marks_b1;
        this.marks_b2= marks_b2;
        this.marks_b3= marks_b3;
    }
    @Override
    void getPercentage() {
        int result= ((marks_b1+marks_b2+marks_b3)*100)/(300);
        System.out.println(result);
    }
}
public class percentage_student {
    public static void main(String[] args) {
        Marks a = new A(90,95 ,90);
        a.getPercentage();
        Marks b = new B(85,85,85);
        b.getPercentage();
    }
}
