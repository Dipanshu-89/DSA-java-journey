package assignment04;

public class Ques1 {
    public static void main(String[] args){
        maxAndMin(8,0,2);
    }
    public static void maxAndMin(int val_1,int val_2,int val_3){
        int max=val_1;
        int min=val_1;
        if(max<val_2){
            max=val_2;
        }
        if(max<val_3){
            max=val_3;
        }
        if(min>val_2){
            min=val_2;
        }
        if(min>val_3){
            min=val_3;
        }
        System.out.println("maximum value is: "+max);
        System.out.println("minimum value is: "+min);
    }
}
