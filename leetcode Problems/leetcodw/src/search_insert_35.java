public class search_insert_35 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
//        int result = 0;

        if(target==0){
            return 0;
        }
        if(nums.length ==1&&target<nums[0]){
            return 0;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){

                start = mid+1;
            }else{

                end=mid-1;
            }
        }
        return start;
    }
}
