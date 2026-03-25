package assignment04;

public class Ques12 {
    public static void main(String[] args){
        boolean res=pythagorean(5,4,3);
        System.out.println(res?"Pythagorean triplet":"not a Pythagorean triplet");
    }
    public static boolean pythagorean(int a,int b,int c){
        return (int)Math.pow(a,2)== (int)Math.pow(b,2)+(int)Math.pow(c,2);
    }
}
