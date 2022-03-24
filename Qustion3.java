public class Qustion3 {

    static boolean check (int [] array){
        boolean found=true;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>-1){
                found= true;
                break;}
            else
                found=false;}
        if (found)
            return true;
        else
            return false;
    }

    static void remove(int []a){
        int numofindex;

        while (check(a)){
            numofindex=(int ) (Math.random()*a.length);
            a[numofindex]=-1;
        }
        System.out.println("delete done");
    }

    public static void main(String[] args) {
        int [] a=new int[10];
        int [] a1=new int[100];
        remove(a);

       // remove(a1);

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}
