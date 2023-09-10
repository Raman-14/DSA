package DSA_Inteilj.src.functionsMethods;

import java.util.Scanner;

public class function {
    public static void main(String[] args){
        // Q: take input of 2 numbers and print the sum
//        int num1, num2;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//         num1 = in.nextInt();
//        System.out.println("Enter number 2: ");
//         num2 = in.nextInt();
//        System.out.println(num1 + num2);
//        sum();
        int ans = sum();
        System.out.println(ans);
        // isko ab agar bht baar karna hga toh fir se same code likhna hoga iske,
        // liye hum function or method ka use kr skte hai jisme hum block of code ko,
        // bht baare repeat kr sakte hai
    }

    // function written here
//    static void sum(){
    static int sum(){
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
//        System.out.println(num1 + num2);
        int num3 = num1 + num2;
        return num3;
    }
}
