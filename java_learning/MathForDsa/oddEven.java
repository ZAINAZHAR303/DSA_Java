public class oddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(n +" is odd :"+isOdd(n));
        System.out.println(n +" is even :"+isEven(n));

    }

    private static boolean isOdd(int n){
        return((n&1) ==1);
    }

    private static boolean isEven( int n){
        return ((n&1) == 0);
    }
}
