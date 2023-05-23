import java.util.ArrayList;
import java.util.Iterator;

public class iterate_arraylist {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insert elements into the ArrayList
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Iterate using iterator
        System.out.println("Iterator Loop:");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        // Iterate using advanced for-loop
        System.out.println("Advanced For Loop:");
        for (int element : arrayList) {
            System.out.println(element);
        }

        // Iterate using for-loop
        System.out.println("For Loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            System.out.println(element);
        }
    }
}
