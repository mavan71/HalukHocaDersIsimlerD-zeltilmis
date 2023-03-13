package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        //girilen bir Tam Sayının Çift ise yarısını Değilse
        // "agredeşşş tek in yarısı tam olmaz print eden code dreat ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=scan.nextInt();

        //Object sonuc =(sayi%2==0)?(sayi/2):("agredeşş tek in yarısı tam olmaz");
        //System.out.println(sonuc);
        System.out.println((sayi%2==0)?(sayi/2):("agredeşş tek in yarısı tam olmaz"));





    }
}
