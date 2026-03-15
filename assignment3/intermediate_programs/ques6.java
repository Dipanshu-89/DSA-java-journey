package assignment3.intermediate_programs;

import java.util.Locale;
import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total sales: ");
        int sales= sc.nextInt();
        System.out.println("enter the commission amount");
        int com=sc.nextInt();
        float commissionPercentage=(float)com*100/sales;
        System.out.println("commission percentage is "+commissionPercentage+"%");
    }
}
