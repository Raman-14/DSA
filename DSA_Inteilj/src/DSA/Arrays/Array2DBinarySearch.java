package DSA_Inteilj.src.DSA.Arrays;

import java.util.Arrays;

public class Array2DBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {{1,3,6},
        {8,9,10},
        {12,14,19}};
        int target = 12;
        System.out.println(Arrays.toString(Search(arr,target)));

    }
    static int[] Search(int[][] arr, int target){
    int r = 0;
    int c = arr.length-1;
    while(r<arr.length && c >=0){
        if(arr[r][c]==target){
            return new int[]{r,c};
        }
        if(arr[r][c]<target){
            r++;
        }else{
            c--;
        }
    }
    return new int[] {-1,-1};
    }

}
