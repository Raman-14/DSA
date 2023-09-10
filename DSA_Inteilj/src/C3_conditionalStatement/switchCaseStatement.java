package C3_conditionalStatement;

public class switchCaseStatement {
    public static void main(String[] args){
     /*   int dayofweek = 2;
        switch (dayofweek){
            case 1:
                System.out.println("very busy");
                break;
            case 2:
                System.out.println("playing guitar");
                break;
            case 3:
                System.out.println("reading books");
                break;
            default:
                System.out.println("dont know");
        }*/
        int rating = 3;
        switch (rating){
            case 1:
            case 2:
                System.out.println("bad");
                break;
            case 3:
                System.out.println("average");
                break;
            case 4:
            case 5:
                System.out.println("good");
                break;
        }
    }
}
