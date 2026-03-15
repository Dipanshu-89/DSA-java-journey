package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter original price: ");
        int price=scanner.nextInt();
        System.out.println("enter depreciation rate:");
        int rate=scanner.nextInt();
        System.out.println("enter time:");
        int time=scanner.nextInt();
        float depreciation=(float) Math.pow((1- (double) rate /100),time);
        System.out.println("depreciation is: "+depreciation);
        System.out.println("value is your asset "+depreciation*price);
    }
}
