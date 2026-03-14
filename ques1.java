package assignment1;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int year=scanner.nextInt();
        if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) System.out.println("leap year");
        else System.out.println("not a leap year");
    }
}
