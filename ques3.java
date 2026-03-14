package assignment1;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int a=scanner.nextInt();
        for(int i=1;i<=100;i++){
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }
}
