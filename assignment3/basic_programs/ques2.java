package assignment3.basic_programs;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base: ");
        int base=sc.nextInt();
        System.out.println("enter height: ");
        int h=sc.nextInt();
        int area=(base*h)/2;
        System.out.println("area of triangle is: "+area);
    }
}
