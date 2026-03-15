package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int num=scanner.nextInt();
        int sum=0;
        while(num != 0){
            sum+=num % 10;
            num/=10;
        }
        System.out.println("sum of a digit is "+sum);
    }
}
