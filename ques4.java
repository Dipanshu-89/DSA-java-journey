package assignment1;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=scanner.nextInt();
        System.out.println("enter the value of b:");
        int b=scanner.nextInt();
        int temp1=a,temp2=b;
        while(b != 0){
            int hcf=b;
            b=a % b;
            a=hcf;
        }
        System.out.println("hcf is: "+a);
        int lcm=temp1*temp2/a;
        System.out.println("your lcm is: "+lcm);
    }
}
