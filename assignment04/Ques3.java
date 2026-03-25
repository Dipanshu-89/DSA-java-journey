package assignment04;

public class Ques3 {
    public static void main(String[] args) {
        boolean result=checkEligible(13);
        if(result) System.out.println("eligible");
        else System.out.println("not eligible");
    }
    public static boolean checkEligible(int age){
        return age >= 18;
    }
}
