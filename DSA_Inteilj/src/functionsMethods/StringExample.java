package DSA_Inteilj.src.functionsMethods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String naam = in.next();
        String greeting = myGreet(naam);
        System.out.println(greeting);
    }
    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }
}
