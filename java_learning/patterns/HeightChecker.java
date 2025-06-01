public class HeightChecker {
    public static void main(String[] args) {
        int [] heights = {1,1,4,2,1,3};
        Height(heights);
    }

    static void  Height(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,arr[j],arr[j+1]);
                }
            }
        }


    }


    static void swap(int[] arr, int first, int second){

    }
}
