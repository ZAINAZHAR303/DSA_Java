public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,15,26,37,38,69,96};
        int target = 96;
        int ans = OrderAgnostics(arr,target);
        System.out.println(ans);

    }
    static int OrderAgnostics(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] ==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(arr[mid]>target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
