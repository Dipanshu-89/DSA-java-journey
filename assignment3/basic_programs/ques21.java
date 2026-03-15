package assignment3.basic_programs;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter terms:");
        int term= sc.nextInt();
        int f=0;
        int s=1;
        for(int i=1;i<=term;i++){
            System.out.print(f+" ");
            int next=f+s;
            s=f;
            f=next;
        }
    }
}
