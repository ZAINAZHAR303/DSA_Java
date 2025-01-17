import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int target = in.nextInt();
        int [] nums = {1,2,3,4,5};

        int result = linearSearch(nums, target);
        System.out.println(result);
    }


    static boolean linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for(int ele : arr) {

            if(ele == target) {
                return true;
            }
        }
        return false;
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

}
