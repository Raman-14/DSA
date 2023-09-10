package DSA_Inteilj.src.DSA.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,4,2,5,6,7,32,23};
        int target = 10;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }

    }

