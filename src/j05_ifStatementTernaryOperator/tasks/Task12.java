package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
 Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Bir Karekter giriniz");
        char cr=scan.next().charAt(0);

        if((cr>='A' && cr<='Z') || (cr>='a' && cr<='z')) {
            System.out.println("girdiğimiz Karakter Harftir");

        }else System.out.println("Girdiğiniz Karakter Harf Değildir");



    }
}
