public class Arranging_coins {

    public static void main(String[] args) {

        int n = 1804289383;
        System.out.println(arrangeCoins(n));

    }

    static int arrangeCoins(int n) {


        // if (n==1){
        //     return 1;
        // }
        // if(n==0){
        //     return 0;
        // }
        int start = 1;
        int end = n;
        while(start<= end){
            int mid = start + (end-start)/2;
            long total = (long) mid*(mid+1)/2;
            if(total == n){
                return mid;
            }
            if(total>n){
                end= mid-1;
            }else{
                start = mid+1;
            }

        }
        return end;
    }
}
