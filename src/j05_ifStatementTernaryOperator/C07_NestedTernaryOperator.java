package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {


        /*girilen Pozitif Bir tamsayı 4 basmaklı ise "4 basamaklı"
        değilse çift sayi olup olmadığını kontrol edip çift ise 4 basamaklı olmayan
        tek sayi print eden code creat ediniz.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi gir");
        int sayi = scan.nextInt();

        String s = (sayi > 999 && sayi < 10000) ? ("4 Basamaklı") : (sayi % 2 == 0 ? "4 Basamaklı olmayan Çift sayi" : "4 Basamaklı olmayan Tek sayi");
        System.out.println(s);


    }
}
