package DSA_Inteilj.src.DSA.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,1,2};
        int target = 2;
//        System.out.println(findPivot(arr));
        System.out.println(findBinary(arr, target));
    }

    static int findBinary(int[] arr, int target){

        int peak = findPivot(arr);
        // if there is no pivot it is normal sorted array
        // so apply normal binary search
        if (target == arr[peak]){
            return peak;
        }
        if (findPivot(arr)==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(target<arr[0]){
            return binarySearch(arr, target,peak+1,arr.length-1);
        }else return binarySearch(arr, target,0, peak-1 );
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target<arr[middle]){
                end = middle-1;
            }else if(target>arr[middle]){
                start = middle+1;
            }else return middle;
        }
        return -1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
        int middle = start + (end - start) / 2;
            if (middle<end && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if (middle>start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }
            if (arr[start] <= arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
            return -1;
    }
}
