package DSA_Inteilj.src.DSA.Arrays;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 5;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int middle;
        while(start<=end){
            middle = start + (end-start)/2;
            if(target<arr[middle]){
                end = middle-1;
            } else if (target>arr[middle]) {
                start = middle+1;
            }else return arr[middle];
        }
        return arr[end];
    }

}
