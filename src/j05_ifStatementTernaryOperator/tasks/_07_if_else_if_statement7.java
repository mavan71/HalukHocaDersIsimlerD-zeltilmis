package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {

 /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
    //   Scanner scan = new Scanner(System.in);

    //   int number = scan.nextInt();

    //   //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

    //   if (number % 2 == 0) {
    //       System.out.println("number is a EVEN number");
    //   }
    //   if (number % 2 != 0) {
    //       System.out.println("number is a ODD number");
    //   }
        Scanner scan =new Scanner (System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi=scan.nextInt();

        if (sayi %2 ==0){
            System.out.println("number is a even number");
        }
        else if(sayi %2 !=0) {
            System.out.println("number is a ODD number");
        }






    }
}
