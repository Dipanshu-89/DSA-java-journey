package assignment04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        List<Integer> res=checkPrimeNumber(a,b);
        for(int i:res){
            System.out.println(i);
        }
    }
    public static List<Integer> checkPrimeNumber(int a,int b){
        List<Integer> list = new ArrayList<>();
        int k=0;
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c == 2){
                list.add(i);
            }
        }
        return list;
    }
}
