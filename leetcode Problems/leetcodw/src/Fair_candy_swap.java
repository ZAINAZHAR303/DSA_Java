import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Fair_candy_swap {

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(A, B)));
    }




        static int[] fairCandySwap(int[] A, int[] B) {
            Set<Integer> setB = new HashSet<>();
            int[] result = new int[2];
            int totalA = 0;
            int totalB = 0;

            for(int a : A){
                totalA += a;
            }
            for (int b: B){
                totalB += b;
                setB.add(b);

            }

            int delta = (totalB-totalA)/2;

            for(int a : A){
                if (setB.contains(a + delta)){
                    result[0] = a;
                    result[1] = a+delta;
                    return result;
                }
            }

            return null;
        }

}
