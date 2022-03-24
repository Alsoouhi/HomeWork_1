import java.util.Arrays;

public class Qustion2 {
    static int Array[]=new int[10];;
   static int numberofelement=0;


    static void backup (int x[]){
            int sum=0;
        for (int i = 0; i <x.length; i++){
        if (numberofelement+sum!= Array.length-1){
            Array[numberofelement+i]=x[i];
            sum++;
            System.out.println("added is successful");
        }

        else
        System.out.println("the array is full");}
        numberofelement=sum;

    }

    public static void main(String[] args) {
        int  [] x={1,2,3,4,5};
        int [] a={6,7,8,9,0,10};

        backup(x);
        backup(a);



}}
