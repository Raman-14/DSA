package C2_whileLoops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
      /*  int n = 0;
        do{
           System.out.println("n is " + 0);
        }while(n != 0);*/
        //Example2
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do {
            n = sc.nextInt();
            System.out.println("number is " + n);
        }while(n != 0);

    }
}

