package assignment2;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the currency in rupees:");
        float currency = scanner.nextFloat();
        System.out.println("currency in usd: "+(currency/92.35));
    }
}
