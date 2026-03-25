package assignment04;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius: ");
        int r=sc.nextInt();
        double res1=calculateCircumference(r);
        double res2=calculateArea(r);
        System.out.println("area is : "+res2+"\n"+"circumference is : "+res1);
    }
    public static double calculateCircumference(int radius){
        return 2*Math.PI*radius;
    }
    public static double calculateArea(int radius){
        return Math.PI*radius*radius;
    }
}
