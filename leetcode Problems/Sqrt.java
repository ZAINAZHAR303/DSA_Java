public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mysqrt(x));
    }

    static int mysqrt(int x){
        int result = 0;

        int start = 1;  // 1 to x
        int end = x;

        while(start<=end){
            int mid = start + (end-start)/2; // to avoid overflow

            if(mid <=end/mid){     //mid = end/mid   => mid*mid =end
                result = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
           
           
        }
        return result;


    }
    
}
