package C3_conditionalStatement;

public class NestedIfElse {
    public static void main(String[] args){
        int a = 9, b = 69, c = 7;
        int result = 0;
       /* if( a > b) {
            if (a > c) {
                System.out.println("a is greater than b and c");
            } else {
                System.out.println("c is greater than b and a");
            }
        }
        if( b > a ) {
            if (b > c) {
                System.out.println(" b is greater than a and c");
            } else {
                System.out.println("c is greater than b and a");
            }
        }*/
      /*  if(a>=b && a>c){
            System.out.println("a is greater than b and c");
        }
else if(b>=a && b>c){
    System.out.println("b is greater than a and c");
        }
else{
    System.out.println("c is greater than b and a");
        }*/
result = a>b ? a>c ? a:c: b>c ? b : c;
System.out.println(result);

    }
}
