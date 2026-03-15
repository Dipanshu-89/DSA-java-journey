package assignment2;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number1 ");
        int num1=sc.nextInt();
        System.out.println("enter the second number i.e number2 ");
        int num2=sc.nextInt();
        if(num1 > num2){
            System.out.println("number1 is greater than number2");
        }else{
            System.out.println("number2 is greater than number1");
        }
    }
}
