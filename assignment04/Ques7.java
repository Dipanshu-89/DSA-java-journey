package assignment04;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res=primeNumber(scanner.nextInt());
        if(res){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
    public static boolean primeNumber(int num){
        int c=2;
        if(num<=1){
            return false;
        }
        while(c<num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
