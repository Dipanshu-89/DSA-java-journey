package assignment3.basic_programs;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=scanner.nextInt();
        System.out.println("area of circle is: "+(Math.PI*r*r));
    }
}
