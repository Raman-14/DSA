package DSA_Inteilj.src.DSA.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896,8585};
//        System.out.println(findNumbers(num));
        System.out.println(numberOfDigits(-545454));
    }

    static int findNumbers(int[] num){
        int count = 0;
        for(int nums : num){
            if(evenNumber(nums)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean evenNumber(int num){

        int numberOfDigit = numberOfDigits(num);
        if(numberOfDigit % 2 == 0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int numberOfDigits(int num){
        if(num<0){
            num = num * -1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
            }

        return count;
    }

}
