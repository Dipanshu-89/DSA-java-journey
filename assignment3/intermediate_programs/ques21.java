package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();
        int v=0;
        int c=0;
        for(String string:s.split("")){
            if(string.equals("a") || string.equals("e") || string.equals("i") || string.equals("o") || string.equals("u")){
                v++;
            }else {
                c++;
            }
        }
        System.out.println("vowels is "+v+"\nconsonant is "+c);
    }
}
