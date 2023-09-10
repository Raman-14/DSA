
package C6_arrays;
import java.util.Scanner;
public class ArraysSumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("write the number of digits you want to store");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("write the number you want to store");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the sum of all natural number =");
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
