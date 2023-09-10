package DSA_Inteilj.src.DSA.Arrays;

public class FindMin {
    public static void main(String[] args){
        int[] arr = {23,2,43,-7,56,32,66,34,22};
        System.out.println(min(arr));
    }
    // assume arr.length !=0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
