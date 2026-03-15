package assignment3.intermediate_programs;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days=31;
        int count=0;
        for(int i=1;i<=days;i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("Kunal goes to his friend "+count+" days");
    }
}
