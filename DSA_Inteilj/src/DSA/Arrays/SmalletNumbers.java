package DSA_Inteilj.src.DSA.Arrays;

public class SmalletNumbers {
    public static void main(String[] args) {
        char[] letters = {'c', 'e', 'g'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;

        int end = letters.length-1;
        int middle;
        while(start<=end){
            middle = start + (end-start)/2;
            if(target<letters[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return letters[start%letters.length];
    }
}
