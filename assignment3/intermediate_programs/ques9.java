package assignment3.intermediate_programs;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total runs: ");
        int totalRuns=scanner.nextInt();
        System.out.println("enter the times out: ");
        int timesOut=scanner.nextInt();
        if(timesOut == 0){
            System.out.println("we do not calculate average ");
            return;
        }
        float average=(float) totalRuns/timesOut;
        System.out.println("average match score is "+average);
    }
}
