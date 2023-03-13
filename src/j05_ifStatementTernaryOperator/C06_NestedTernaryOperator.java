package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        //Girilen sayi 0 dan büyük eşit ise 10 dan küçüklüğünü kontrol ediniz.
       // 10 dan küçük ise "Rakam değilse pozitif sayi" +
         //   "sayi 0 dan küçük ise "Negatif Sayi" print eden code creat ediniz."

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi gir");
        int sayi = scan.nextInt();

        System.out.println((sayi >= 0 ? (sayi < 10 ? ("Rakam") : ("Pozitif Sayi")) : "Negatif Tam Sayi..."));
//nekadar soru işareti okadar : iki nokte
        //show businiz trik Javada Nested Bloklar app. run edildiğinde yavaşlatır (time Cömpllexity )
        // dolayısıyla nexted bloklar tercih edilmez.



        }

}
