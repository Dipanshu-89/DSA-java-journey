package assignment3.basic_programs;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base=scanner.nextInt();
        System.out.println("enter height:");
        int h=scanner.nextInt();
        System.out.println("area of parallelogram is: "+base*h);
    }
}
