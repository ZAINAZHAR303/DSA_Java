public class DigitSum {
    public static void main(String[] args) {
     int ans = sum(3467);
        System.out.println(ans);
    }

    static int sum(int n){
        if (n==0){
            return n;
        }
        return n%10 + sum(n/10);

    }
}
