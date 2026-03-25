package assignment04;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks: ");
        int mark=scanner.nextInt();
        grade(mark);
    }
    public static void grade(int marks){
        if(marks<=100 && marks>=91){
            System.out.println("AA");
        }else if(marks<=90 && marks>=81){
            System.out.println("AB");
        }else if(marks<=80 && marks>=71){
            System.out.println("BB");
        }else if(marks<=70 && marks>=61){
            System.out.println("BC");
        }else if(marks<=60 && marks>=51){
            System.out.println("CC");
        }else if(marks<=50 && marks>=41){
            System.out.println("CD");
        }else{
            System.out.println("you got jannat");
        }
    }
}
