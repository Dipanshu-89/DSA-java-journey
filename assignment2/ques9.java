package assignment2;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the start num: ");
        int start=scanner.nextInt();
        System.out.println("end :");
        int end=scanner.nextInt();
        for(int j=start;j<=end;j++){
            int temp=j;
            int i=temp;
            int c=0;
            while(i != 0){
                c++;
                i=i/10;
            }
            i=temp;
            int sum=0;
            while(i >0){
                sum=sum+(int)Math.pow(i % 10,c);
                i/=10;
            }
            if(temp == sum){
                System.out.println("number is armstrong "+temp);
            }
        }
    }
}
