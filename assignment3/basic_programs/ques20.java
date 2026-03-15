package assignment3.basic_programs;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side");
        int side=sc.nextInt();
        int area=6*side*side;
        System.out.println("area of cube :"+area);
    }
}
