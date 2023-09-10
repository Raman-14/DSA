package C4_Loops;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        boolean isboolean = true;
        for (int i=2; i * i < m; i++){
         if (m % i == 0){
             isboolean = false;
             break;
         }
        }
        if(m<2) isboolean = false;
        System.out.println("isboolean " + isboolean);
    }
}
