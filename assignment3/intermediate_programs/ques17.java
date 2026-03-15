package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        int temp=num;
        int rev=0;
        while(num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        if(rev == temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("NOt a Palindrome number");
        }
    }
}
