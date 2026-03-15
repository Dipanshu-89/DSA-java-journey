package assignment3.basic_programs;

import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius: ");
        int r=scanner.nextInt();
        System.out.println("enter the height:");
        int h=scanner.nextInt();
        double total_surface_area=2*Math.PI*r*h;
        System.out.println("total surface area of cylinder: "+total_surface_area);
    }
}
