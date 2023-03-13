package J08_Loops.Tasks;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */
        System.out.println("1.yol" );
     for(int i=1;i<=4;i++){
     for (int j=1;j<=i;j++) {
     System.out.print(j+" ");
     }System.out.println();
     }System.out.println("2.yol" );
        for (int kat = 1; kat <= 4; kat++) {

            for (int daire = 1; daire <= kat; daire++) {
                System.out.print(daire+ " ");
            }
            System.out.println();
        }



    }
}
