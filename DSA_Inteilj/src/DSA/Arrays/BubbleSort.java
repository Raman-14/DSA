package DSA_Inteilj.src.DSA.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,1,8,-3,6,4,12};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[] arr){
    boolean swapped;
    for(int i = 0; i <arr.length; i++){
        swapped = false;
        //check the array number in internal loop
        for(int j = 0; j<arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
            }
            if(swapped = false){
                break;
        }
    }
    }
}
