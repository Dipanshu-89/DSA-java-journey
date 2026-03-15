package assignment2;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        StringBuilder string = new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            string.append(arr[i]);
        }
        if(string.toString().equals(s)){
            System.out.println("its a palindome string");
        }else{
            System.out.println("not palindrome string");
        }
    }
}
