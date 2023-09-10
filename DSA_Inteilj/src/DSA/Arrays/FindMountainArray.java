package DSA_Inteilj.src.DSA.Arrays;

public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,10,4,3,2};
        int target = 10;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int peak = PeakNoInMountainArray(arr);
        int firstTry = OrderAgnosticSearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return OrderAgnosticSearch(arr, target, peak+1, arr.length-1);
    }
    static int PeakNoInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int middle = start + (end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end = middle;
            }else{
                start = middle + 1;
            }
        }
        return start;
    }
    static int OrderAgnosticSearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    }
