package assignment2;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int principal,rate,time,si;
        System.out.println("enter the principal: ");
        principal=scanner.nextInt();
        System.out.println("enter the rate: ");
        rate=scanner.nextInt();
        System.out.println("enter the time");
        time=scanner.nextInt();
        si=principal*rate*time/100;
        System.out.println("simple interest is this: "+si);
        int result=principal+si;
        System.out.println(result);
    }
}
