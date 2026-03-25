package assignment04;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int res=sum(scanner.nextInt(),scanner.nextInt());
        System.out.println(res);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
