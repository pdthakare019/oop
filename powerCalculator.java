class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class powerCalculator {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        try {
            long result1 = calculator.power(2, 3);
            System.out.println("2 raised to the power of 3 is: " + result1);

            long result2 = calculator.power(-2, 4);
            System.out.println("This line won't be executed.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

