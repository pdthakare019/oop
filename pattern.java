public class pattern {
    public static void main(String[] args) {
        int numRows = 7; // Number of rows (half of the diamond)

        // Print upper half of the diamond
        for (int i = 1; i <= numRows; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower half of the diamond
        for (int i = numRows - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

