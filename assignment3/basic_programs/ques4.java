package assignment3.basic_programs;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        int b=sc.nextInt();
        System.out.println("enter height: ");
        int h=sc.nextInt();
        System.out.println("area of isosceles triangle: "+b*h/2);
    }
}
