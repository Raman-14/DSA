package C4_Loops;
import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        float sum = 0;
        for(float i = 1; i<=m; i++){
            sum = sum + 1/i;
        }
        System.out.println(sum);
    }
}
