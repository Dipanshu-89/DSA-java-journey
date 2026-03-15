package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of total subjects:");
        int totalSubjects=scanner.nextInt();
        int score=0;
        for(int i=1;i<=totalSubjects;i++){
            int credit=scanner.nextInt();
            if(credit == 10){
                score+=credit;
            }else if(credit == 9){
                score+=credit;
            }
            else if(credit == 8){
                score+=credit;
            }
            else if(credit == 7){
                score+=credit;
            }else if(credit == 6){
                score+=credit;
            }else if(credit == 5){
                score+=credit;
            }else{
                score+=credit;
            }
        }
        float cgpa=(float)score/totalSubjects;
        System.out.printf("your semester cgpa  is %.2f ",cgpa);
    }
}
