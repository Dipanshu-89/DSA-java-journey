package assignment2;

import java.util.Scanner;

public class ques7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int f=0;
        int s=1;
        for(int i=1;i<=n;i++){
            System.out.print(f+" ");
            int next_term=f+s;
            s=f;
            f=next_term;
        }
    }
}
