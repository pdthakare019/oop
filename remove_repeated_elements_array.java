import java.util.Arrays;
import java.util.*;

public class remove_repeated_elements_array {
    public static int[] removeDuplicates(int [] arr){
        int n = arr.length;
        if (n==0||n==1){
            return arr;
        }
        Arrays.sort(arr);

        int [] temp= new int [n];
        int j=0;
         for (int i=0;i<n;i++){
             if (i==n-1 || arr[i]!=arr[i+1]){
                 temp[j++]=arr[i];
             }
         }
         int [] uniqueArr = new int[j];
         for(int i=0;i<j;i++){
             uniqueArr[i]=temp[i];
         }
         return uniqueArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 7, 5};
        System.out.println("Original array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array with duplicates removed: ");
        for (int i=0;i<uniqueArr.length;i++){
            System.out.print(uniqueArr[i]+" ");
        }
    }
}




