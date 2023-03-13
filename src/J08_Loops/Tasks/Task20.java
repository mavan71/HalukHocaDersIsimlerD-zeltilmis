package J08_Loops.Tasks;

public class Task20 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        for (int kat = 1; kat <= 5; kat++) {
            int sayi = kat;
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print(sayi + " ");
                sayi = sayi + (5 - daire);
            }
            System.out.println();
        }



    }
}
