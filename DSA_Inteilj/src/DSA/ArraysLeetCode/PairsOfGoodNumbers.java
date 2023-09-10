package DSA.ArraysLeetCode;
import java.util.Scanner;
public class PairsOfGoodNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gudnum = 0;
        System.out.println("write the number of digits of arrays");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("write the numbers of arrays");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            for(int j = i++; j<n-1; j++){
                if (arr[i] == arr[j]){
                   gudnum++;
                }

            }
        }
      System.out.println(gudnum);
    }
}
