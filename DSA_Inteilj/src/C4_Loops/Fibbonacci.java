package C4_Loops;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args){
        // 1, 1, 2, 3, 5, 8, 13....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /* int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=0; i<n-2; i++){
        int c = a + b;
        System.out.print(c + " ");
        a=b;
        b=c;
        }*/
int m = sc.nextInt();
int result = 1;
for(int i = 0; i<m; i++){
    result = result * n;
}
        System.out.println(result);
    }
}
