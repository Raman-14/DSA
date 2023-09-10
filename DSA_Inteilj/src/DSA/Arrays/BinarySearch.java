package DSA_Inteilj.src.DSA.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

    int[] arr = {100,99,85,76,75,74,73,72,71,70,69,68,67};
        int target = 75;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int middle;
        while(start<=end){
            middle = start + (end - start)/2;
            if(target>arr[middle]){
                end = middle - 1;
            } else if (target<arr[middle]) {
                start = middle + 1;
            }else return middle;
        }
        return -1;
    }

}
