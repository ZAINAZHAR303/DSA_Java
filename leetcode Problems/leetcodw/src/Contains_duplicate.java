import java.util.HashSet;

public class Contains_duplicate {
    public static void main(String[] args) {
     int [] nums = {1,2,3,1};
     System.out.println(containsDuplicate(nums));
    }


//        static boolean containsDuplicate(int[] nums) {
//            for (int i = 0; i <nums.length; i++){
//                for(int j=0 ; j<nums.length ; j++){
//                    if(nums[i]==nums[j] && i!=j){
//                        return true;
//                    }
//                }
//            }
//
//            return false;
//        }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
