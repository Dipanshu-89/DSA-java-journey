package assignment3.intermediate_programs;

import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String string = "";
        char[] chars = s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            string+=chars[i];
        }
        System.out.println(string);
    }
}
