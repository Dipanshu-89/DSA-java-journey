package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the price of item: ");
        int price=scanner.nextInt();
        System.out.println("enter discount that item: ");
        int discount=scanner.nextInt();
        float final_price=price-(price*discount/100.0f);
        System.out.println("your final price after discount: "+final_price);
        scanner.close();
    }
}
