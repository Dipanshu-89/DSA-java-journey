package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first point:");
        int x=sc.nextInt();
        int x1=sc.nextInt();
        System.out.println("enter the second point: ");
        int y=sc.nextInt();
        int y1=sc.nextInt();
        float dis=(float) Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
        System.out.println("distance is: "+dis);
    }
}
