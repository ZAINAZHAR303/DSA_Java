import java.util.Arrays;
import java.util.List;

public class Kids_Candies {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        kidsWithCandies(arr,3);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] result = new Boolean[candies.length];

        for(int i=0;i<candies.length;i++){
            int high = candies[i]+extraCandies;
            System.out.println(high+"high");
            // result[i] = false;
            for(int j=0;j<candies.length;j++){
                System.out.print(candies[j]+" "+high+" ");
                if(high>candies[j]){
                    result[i] = true;

                }


            }

        }
        return Arrays.asList(result);
    }
}
