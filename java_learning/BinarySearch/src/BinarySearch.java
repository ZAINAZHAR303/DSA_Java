public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,24,44,54,65,70};
        int target = 70;
        int result = BinarySearch(arr,target);
        System.out.println(result);
    }
    static int BinarySearch(int[]arr, int target) {
        int start = arr[0];
        int end = arr.length - 1;
        System.out.println(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }


        }
        return -1;
    }
}
