package assignment04;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean val=isPalindrome(num);
        System.out.println(val?"palindrome number":"not a palindrome number");
    }
    public static boolean isPalindrome(int num){
        int sum=0;
        int temp=num;
        while(num != 0){
            sum=sum*10+(num % 10);
            num=num/10;
        }
        return temp == sum;
    }
}
