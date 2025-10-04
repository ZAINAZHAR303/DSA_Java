// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class DuplicatesFind {
    public static void main(String[] args) {
        int [] arr = {4,2,2,3,1,2,3};
        cyclicSort(arr);
        // System.out.println(Arrays.toString(arr));

        List<Integer> duplicates = new ArrayList<>();
        // int n = arr.length;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                duplicates.add(arr[j]);
            }
        }
        System.out.println(duplicates);
    }
    
    
    static void cyclicSort(int [] arr){
        int i = 0;
//        System.out.println((arr));
        while (i < arr.length) {
            
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(i, correct, arr);
            }else{
                i++;
            }
    }
    }

    static void swap(int first, int second,int[] arr){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;

    }
}