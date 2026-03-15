package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int sum=0;
        int c=0;
        while(true){
            int n=sc.nextInt();
            if(n == 0){
                break;
            }
            sum+=n;
            c++;
        }
        System.out.println("average is: "+(float)sum/c);
    }
}
