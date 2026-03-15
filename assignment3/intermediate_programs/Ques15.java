package assignment3.intermediate_programs;

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operation name:(p for permutation or c for combination :");
        String s = scanner.nextLine();
        System.out.println("enter the value of n: ");
        int n=scanner.nextInt();
        System.out.println("enter the value of r: ");
        int r=scanner.nextInt();
        if(s.equals("permutation") || s.equals("p")){
            int fact=1;
            int fact2=1;
            int res=n-r;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            for(int i=1;i<=res;i++){
                fact2*=i;
            }
            System.out.println("permutation is: "+fact/fact2);
        }else{
            int fact=1;
            int fact2=1;
            int fact3=1;
            int res=n-r;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            for(int i=1;i<=r;i++){
                fact2*=i;
            }
            for(int i=1;i<=res;i++){
                fact3*=i;
            }
            System.out.println("your combination is: "+fact/(fact2*fact3));
        }
    }
}
