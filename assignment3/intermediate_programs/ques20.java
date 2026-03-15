package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int firstNum=scanner.nextInt();
        System.out.println("enter the second number: ");
        int secondNumber=scanner.nextInt();
        int temp1=firstNum;
        int temp2=secondNumber;
        while(secondNumber != 0){
            int hcf=secondNumber;
            secondNumber =firstNum % secondNumber;
            firstNum=hcf;
        }
        int lcm=temp1*temp2/firstNum;
        System.out.println("your lcm is "+lcm);
    }
}
