import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class count_words_file {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\SY\\SY SEM 2\\OOP(JAVA)\\demo.txt");
            Scanner sc = new Scanner(file);

            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            sc.close();
            System.out.println(count);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
