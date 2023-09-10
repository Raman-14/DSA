package C5_NestedForLoops;

public class Table {
    public static void main(String[] args){
        for(int i = 2; i<=20; i++){
            for(int j = 1; j<=10; j++){
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
