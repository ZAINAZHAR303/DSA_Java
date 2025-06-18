import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

                int j=0;
                int l=k;
                for(int i = nums.length-k;i<nums.length; i++){
                    Swap(nums,j,nums.length-l);
                    j++;
                    l--;
                }
                BubbleSort(nums,k,nums.length-1);
        System.out.println("rotated array:");
        System.out.println(Arrays.toString(nums));







    }
    static void Swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

   static void BubbleSort(int[] nums, int start, int end){
       boolean swapped;
       for(int i =start; i<=end; i++){
           int k=0;
           swapped = false;
           for(int j=start+1 ; j<nums.length-k ; j++){
               if(nums[j]<nums[j-1]){
                   int temp = nums[j];
                   nums[j] = nums[j-1];
                   nums[j-1] = temp;
                   swapped = true;
               }
           }
           k+=1;
           if(!swapped){
               break;
           }
       }

   }
}
