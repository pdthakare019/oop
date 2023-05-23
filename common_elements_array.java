import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class common_elements_array {
    public static int [] find_common_elements(int[] arr1, int [] arr2){
        List<Integer> common = new ArrayList<>();

        for (int i:arr1){
            for (int j: arr2 ){
                if (i==j) {
                    common.add(i);
                    break;
                }
            }
        }
        int [] common_elements = new int[common.size()];
        for (int i=0;i<common.size();i++){
            common_elements[i]=common.get(i);
        }
        return common_elements;
    }
    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5};
        int [] arr2= {2,3,5,7};
        int [] common_elements = find_common_elements(arr1,arr2);
        System.out.println("common elements are: ");
        for (int i=0;i<common_elements.length;i++){
            System.out.print(common_elements[i]+" ");
        }
    }
}
