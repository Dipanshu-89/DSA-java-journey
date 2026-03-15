package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value: ");
        int val= sc.nextInt();
        System.out.println("enter the power :");
        int power=sc.nextInt();
        int res=1;
        for(int i=1;i<=power;i++){
            res*=val;
        }
        System.out.println("power is "+res);
    }
}
