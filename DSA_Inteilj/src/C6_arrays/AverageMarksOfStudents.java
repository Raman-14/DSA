package C6_arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();

        int marks[] = new int[n];
        System.out.println("enter the marks now");
        for(int i = 0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        int averageMarks = 0;

        for(int i = 0; i<n; i++){
            averageMarks += marks[i];
        }
        averageMarks /= n;
        System.out.println("the average no. of students is " + averageMarks);

    }
}
