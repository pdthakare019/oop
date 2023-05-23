import java.util.Scanner;
import java.util.HashMap;
public class count_hashmap {
    public static HashMap<String,Integer> countWords(String input){
        String [] words = input.split(" ");

        HashMap<String, Integer> count = new HashMap<>();

        for (String word:words) {
            count.put(word,count.getOrDefault(word, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc. nextLine();

        HashMap<String, Integer> count = countWords(input);
        System.out.println(count);

    }
}
