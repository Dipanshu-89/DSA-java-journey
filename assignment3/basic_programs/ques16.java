package assignment3.basic_programs;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input: i.e. base area");
        int base_area=scanner.nextInt();
        System.out.println("enter input the height: ");
        int height=scanner.nextInt();
        int vol=base_area*height;
        System.out.println("volume of prism: "+vol);
    }
}
