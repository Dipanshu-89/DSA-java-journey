package assignment04;

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        Ques14 obj=new Ques14();
        int res=obj.nTermSum(num);
        System.out.println(res);
    }
    int nTermSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
