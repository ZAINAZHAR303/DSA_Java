import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                System.out.println(nums[j]);
            }
        }

    }
    static void sort(int [] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct] != nums[i]){
                swap(nums,correct,i);
            }else {
                i++;
            }
        }
    }

    static void swap (int [] nums, int correct, int i){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
