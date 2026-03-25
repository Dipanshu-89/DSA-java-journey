package assignment04;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("enter the value of b: ");
        int b=sc.nextInt();
        int res=product(a,b);
        System.out.println(res);
    }
    public static int product(int a,int b){
        return a*b;
    }
}
