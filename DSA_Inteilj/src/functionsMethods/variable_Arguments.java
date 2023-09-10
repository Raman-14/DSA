package DSA_Inteilj.src.functionsMethods;

import java.util.Arrays;

public class variable_Arguments {
    public static void main(String[] args) {
        fun(2,3,4,3,5,5,944,2,34,54,34,12);
    }

    static void fun(int ...v){ // jab hume pta na ho kitna arguments pass karna hai toh ...v likhne se hum jitna mn utna variable pass kar skte hai
        System.out.println(Arrays.toString(v));
    }
}
