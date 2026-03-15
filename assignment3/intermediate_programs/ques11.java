package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the principal :");
        int principal=scanner.nextInt();
        System.out.println("enter the rate: ");
        int rate=scanner.nextInt();
        System.out.println("enter the time:");
        int time=scanner.nextInt();
        double compoundInterest=principal*Math.pow(1+ (double) rate /100,time)-principal;
        System.out.println("compound interest is "+compoundInterest);
        scanner.close();
    }
}
