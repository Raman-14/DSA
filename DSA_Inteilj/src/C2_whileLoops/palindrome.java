package C2_whileLoops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 0;
        long temp = n;
        while(temp>  0){
            long lastdigit = temp % 10;
             temp /= 10;
            r = r * 10 + lastdigit;
            }
        if (r == n){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
        }
    }

