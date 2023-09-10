package C5_NestedForLoops;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 2*n-1;
        for (int i = 0; i < rows; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
                else{
                    for(int j = 0; j<rows-i; j++){
                        System.out.print("* ");
                    }
                }
            System.out.println();
        }
    }
}
