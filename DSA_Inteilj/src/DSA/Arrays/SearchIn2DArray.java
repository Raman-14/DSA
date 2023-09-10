package DSA_Inteilj.src.DSA.Arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr={
                {23,2,4},
                {42,43,3,2},
                {9,6,65,25},
                {8,19,29,32}
        };
        int target = 65;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
}
    }
