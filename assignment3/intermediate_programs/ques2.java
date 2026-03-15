package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter previous unit:");
        int p=sc.nextInt();
        System.out.println("enter current reading or unit");
        int c=sc.nextInt();
        int unit=c-p;
        if(unit<=100){
            int bill=unit*5;
            System.out.println("your electricity bill: "+bill);
        }else if(unit <= 200){
            int bill=100*5+(unit-100)*7;
            System.out.println("your electricity bill: "+bill);
        }else{
            int bill=100*5+100*7+(unit-200)*10;
            System.out.println("your electricity bill: "+bill);
        }
    }
}
