package assignment04;

public class Ques9 {
    public static void main(String[] args) {
        int result=factorial(5);
        System.out.println(result);
    }
    public static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }
}
