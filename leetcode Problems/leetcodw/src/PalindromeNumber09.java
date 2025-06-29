public class PalindromeNumber09 {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            if(x==0){
                return true;
            }
            int originalNo  = x ;
            String output="";
            while(x>0){
                int digit = x%10;
                output = output+digit;
                x= x/10;
            }
            return output.equals(Integer.toString(originalNo));

        }
    }
}


