package assignment3.intermediate_programs;

import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        if(num == sum){
            System.out.println("perfect number ");
        }else{
            System.out.println("not a perfect number");
        }
    }
}
