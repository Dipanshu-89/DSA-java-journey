package assignment3.basic_programs;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();
        System.out.println("perimeter of rectangle is: "+(2*Math.PI*r));
    }
}
