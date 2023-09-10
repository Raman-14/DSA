package DSA_Inteilj.src.DSA.Arrays;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,4,0};
        System.out.println(Search(arr));
    }
    static int Search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int middle;
        while(start<end){
            middle = start + (end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end = middle;
                } else {
                start = middle +1;
            }
        }
        return start;
    }
}
