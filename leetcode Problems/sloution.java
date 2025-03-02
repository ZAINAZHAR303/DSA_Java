public class sloution {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println("answer is : "+thirdMax(nums));
    }
    static int thirdMax(int[] nums) {
     int first_max = Integer.MIN_VALUE;
     int second_max= Integer.MIN_VALUE ;
     int third_max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length ; i++){
            if (nums[i]>first_max){
                first_max=nums[i];
            }
        }
        for(int i=0; i<nums.length ; i++){
            if (nums[i]>second_max && nums[i]<first_max){
                second_max=nums[i];
            }
        }
        for(int i=0; i<nums.length ; i++){
            if (nums[i]>third_max && nums[i]<second_max){
                third_max=nums[i];
            }
        }

        if(third_max == Integer.MIN_VALUE){
            return first_max;
        }else{
            return third_max;
        }
    }
}