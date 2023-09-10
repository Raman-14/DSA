package DSA_Inteilj.src.DSA.Arrays;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
    String name = "raman";
    char target = 'z';
//    System.out.println(search2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
