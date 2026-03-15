package assignment3.basic_programs;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side: ");
        int side=scanner.nextInt();
        float area= (float) Math.sqrt(3)*side*side/4;
        System.out.println("area of equilateral triangle: "+area);
    }
}
