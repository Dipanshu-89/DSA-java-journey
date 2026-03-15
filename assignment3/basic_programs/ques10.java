package assignment3.basic_programs;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side:");
        int s=scanner.nextInt();
        System.out.println("enter the base:");
        int b=scanner.nextInt();
        int per=2*(s+b);            // s- side and b -base
        System.out.println("perimeter of parallelogram: "+per);
    }
}
