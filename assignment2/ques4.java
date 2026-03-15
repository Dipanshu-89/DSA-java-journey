package assignment2;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operation");
        String operation=sc.next();
        System.out.println("enter the first value: ");
        int a=sc.nextInt();
        System.out.println("enter the second value: ");
        int b=sc.nextInt();
        if(operation.equals("addition") || operation.equals("add") || operation.equals("+")){
            System.out.println("addition is this : "+(a+b));
        }
        else if(operation.equals("subtraction") || operation.equals("sub") || operation.equals("-")){
            System.out.println("your subtraction is :"+(a-b));
        }
        else if(operation.equals("*")){
            System.out.println("Multiplication is: "+(a*b));
        }else{
            System.out.println("division is: "+(a/b));
        }
    }
}
