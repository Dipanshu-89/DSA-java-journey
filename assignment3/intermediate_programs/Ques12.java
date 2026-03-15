package assignment3.intermediate_programs;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total subjects:");
        int totalSubject=scanner.nextInt();
        int i=0;
        int score=0;
        while(totalSubject>i){
            System.out.println("enter subject marks: ");
            int marks=scanner.nextInt();
            score+=marks;
            i++;
        }
        float avg= (float) score /totalSubject;
        System.out.println("your average marks "+avg);
    }
}
