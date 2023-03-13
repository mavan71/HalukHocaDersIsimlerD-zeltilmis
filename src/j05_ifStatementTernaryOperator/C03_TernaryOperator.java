package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapılanlar if else ilede yapılıt
        Ternary blok code daha clean daha açık okunabilir
        Ternary code lar conpleks değil dir,
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi1 =scan.nextInt();
        System.out.println("Bir Sayi Gir");
        int sayi2 =scan.nextInt();
       Object bambaskaBirsey = ( (sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)) ? (sayi2 + sayi1) : "agam DEVAMKEE";
        System.out.println(bambaskaBirsey);

    }

}
