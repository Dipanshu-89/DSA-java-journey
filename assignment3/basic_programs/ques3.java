package assignment3.basic_programs;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length: ");
        int l=scanner.nextInt();
        System.out.println("enter the bredth: ");
        int b=scanner.nextInt();
        System.out.println("area of rectangle is: "+(l*b));
    }
}
