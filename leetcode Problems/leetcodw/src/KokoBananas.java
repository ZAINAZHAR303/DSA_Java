public class KokoBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));

    }

    static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            if(piles[i]>end){
                end = piles[i];
            }
        }
        int result = end;
        while (start<=end){
            int mid = start+(end-start)/2;
            int total = 0;
            for(int i=0;i< piles.length;i++){
                total += Math.ceil((double)piles[i] / mid);
            }
            if(total<=h){
                result=mid;
                end=mid-1;

            }else{
                start=mid+1;
            }

        }
        return result;

    }
}
