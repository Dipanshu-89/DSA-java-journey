package assignment3.basic_programs;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter base area:");
        int base_area=scanner.nextInt();
        System.out.println("enter height: ");
        int height=scanner.nextInt();
        float vol= (float) (base_area * height) /3;
        System.out.println("volume of pyramid: "+vol);
        scanner.close();
    }
}
