package assignment2;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        if((num/2)*2 == num){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}

