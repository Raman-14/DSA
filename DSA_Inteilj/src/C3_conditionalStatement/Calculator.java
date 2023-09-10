package C3_conditionalStatement;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("write first number");
        int a = sc.nextInt();
        System.out.println("write second number");
        int b = sc.nextInt();
        System.out.println("enter operation");
        sc.nextInt();
        char operation = sc.nextLine().charAt(0);
        int result = 0;
        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("invalid operation");
                System.out.println(result);
        }
    }
}
