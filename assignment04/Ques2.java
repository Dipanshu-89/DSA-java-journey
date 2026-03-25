package assignment04;

public class Ques2 {
    public static void main(String[] args){
        String res=checkEvenOrOdd(3);
        System.out.println(res);
    }
    public static String checkEvenOrOdd(int num){
        if(num % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}
