package assignment3.basic_programs;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int largest=0;
        while(true){
            System.out.println("give input");
            int n=sc.nextInt();
            if(n == 0){
                break;
            }
            if(largest<n){
                largest=n;
            }
        }
        System.out.println("largest digit or number is:"+largest);
    }
}
