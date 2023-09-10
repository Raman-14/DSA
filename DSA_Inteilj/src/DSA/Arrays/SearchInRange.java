package DSA_Inteilj.src.DSA.Arrays;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {2,32,43,55,32,12,566,34,23,56};
        int target = 152;
        int start = 1;
        int end = 7;
        System.out.println(linearSearch(arr, target, start, end));

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start; index<= end; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
