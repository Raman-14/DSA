package DSA_Inteilj.src.functionsMethods;

public class ChangeValue {
    public static void main(String[] args) {
        int a = 20;
        int b = 23;
        System.out.println(a+" "+b);
    }
    static void changeValue(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }
}
