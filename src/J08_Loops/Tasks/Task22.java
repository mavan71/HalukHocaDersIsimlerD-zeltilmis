package J08_Loops.Tasks;

public class Task22 {

    public static void main(String[] args) {

        /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        100 ve 0 dahil değildir.*/
        System.out.println("*****1.yol*****");
        for(int i=99; i>0; i-=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("*****2.yol*****");
        int a = 99;

        while (a > 0) {
            System.out.print(a + " ");
            a-=2;
        }



    }
}
