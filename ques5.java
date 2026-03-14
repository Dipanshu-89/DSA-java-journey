package assignment1;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            int val=scanner.nextInt();
            if (val == 0) {
                break;
            } else {
                sum += val;
            }
        }
        System.out.println("sum is this : " + sum);
    }
}
