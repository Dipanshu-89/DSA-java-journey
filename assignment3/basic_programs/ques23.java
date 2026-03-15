package assignment3.basic_programs;

import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: (or if you want to stop then press 0)");
        int sum=0;
        while(true){
            System.out.println("give input: ");
            int n=scanner.nextInt();
            if(n == 0){
                System.out.println("ohh sit ");
                break;
            }
            sum+=n;
        }
        System.out.println("your result: "+sum);
    }
}
