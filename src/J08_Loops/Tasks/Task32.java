package J08_Loops.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz

         */

        for (int kat = 1; kat <= 4; kat++) {
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int kat = 1; kat <= 4; kat++) {
            for (int daire = 4; daire > kat; daire--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
