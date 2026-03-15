package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the principal: ");
        int principal=scanner.nextInt();
        System.out.println("enter the rate: ");
        int rate =scanner.nextInt();
        System.out.println("enter the time : ");
        int time =scanner.nextInt();
        System.out.println("future invest interest is: "+Math.pow(1+(double)rate/100,time));
        System.out.println("future invest is: "+(int)principal*Math.pow(1+(double)rate/100,time));
    }
}
