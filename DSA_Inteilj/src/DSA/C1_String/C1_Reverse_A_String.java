package DSA.C1_String;

public class C1_Reverse_A_String {
    public static void main(String[] args) {
        String str = "ABC";

        for(int i=0; i<str.length(); i++)
            System.out.print(str.charAt(str.length()-i-1));
    }
}
