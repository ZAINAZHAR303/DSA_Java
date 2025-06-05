import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] heights = {1,1,4,2,1,3};
        Height(heights);
        System.out.println(Arrays.toString(heights));
    }

    static void  Height(int [] arr){
        int swapNeeded = 0;
        int[] arrCopy = arr.clone();
        for(int i=0;i<arrCopy.length-1;i++){
            for(int j=0;j<arrCopy.length-1;j++){
                if(arrCopy[j]>arrCopy[j+1]){
                    swap(arrCopy,j,j+1);
//                    swapNeeded+=1;
                }
            }
        }

        
        for(int i = 0;i<arrCopy.length;i++){
            if(arr[i] != arrCopy[i]){
                swapNeeded+=1;
            }
        }

        System.out.println("swap need to sort is:"+ swapNeeded);


    }


    static void swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second]= temp;
    }
}
