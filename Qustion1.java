public class Qustion1 {

    static int [] reverse (int Array [],int Array2 []){
        int swap;

        for (int j = 0; j <Array.length ; j++) {
            Array2[j]=Array[Array.length-1-j];
        }
        return Array;
    }

    public static void main(String[] args) {

        int [] a={1,2,3,4,5};
        int [] b=new int[5];
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        a=reverse(a,b);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(b[i]);
        }



    }
}
