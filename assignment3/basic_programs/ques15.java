package assignment3.basic_programs;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius: ");
        int r=scanner.nextInt();
        System.out.println("enter the height: ");
        int h=scanner.nextInt();
        double volume=Math.PI*r*r*h;
        System.out.println("volume of cylinder: "+volume
        );
    }
}
