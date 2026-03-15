package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        int c=0;
        while(num != 0){
            c++;
            num/=10;
        }
        num=temp;
        int sum=0;
        while(num != 0){
            sum=sum+(int) Math.pow(num%10,c);
            num/=10;
        }
        if(temp == sum){
            System.out.println("number is Armstrong");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
