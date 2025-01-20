class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2]; 
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[i];

            
        }
        int x=0;
        for(int j = nums.length; j<nums.length*2;j++){
            ans[j] = nums[x];
            x++;
            }
        
        
        return ans;
    }
}

