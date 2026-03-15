package assignment3.basic_programs;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();
        double vol=4*Math.PI*r*r*r/3;
        System.out.println("volume of sphere :"+vol);
    }
}
