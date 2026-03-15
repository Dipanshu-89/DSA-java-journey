package assignment3.basic_programs;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first diagonal :");
        int d1=scanner.nextInt();
        System.out.println("enter the second diagonal: ");
        int d2=scanner.nextInt();
        int area=d1*d2/2;
        System.out.println("area of rhombus "+area);
    }
}
