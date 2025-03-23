public class Solution {
    public static int[] rotate() {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int j=0;
        for(int i = 1;i<=k; i++){
            Swap(nums,j,nums.length-1);
            j++;
        }

        return nums;
    }
    
    
    static void Swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
    
}