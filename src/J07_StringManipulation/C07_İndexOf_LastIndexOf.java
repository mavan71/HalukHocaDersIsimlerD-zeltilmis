package J07_StringManipulation;

import java.util.Scanner;

public class C07_İndexOf_LastIndexOf {
    public static void main(String[] args) {
/* indexOf()
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */


        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";

        System.out.println(str.indexOf(':'));//40
        System.out.println(str.indexOf(":)"));//40
        System.out.println(str.indexOf("x"));//-1-> x olamdığı için -1 verir
        System.out.println(str.indexOf("ya"));//16
        // Trick-> olmayan karakter için index -1 return eder
        // Trick-> birden çok karakter veya string için -> ilk okunan değerin indexiniverir
        System.out.println("str.indexOf(\"a\",13) = " + str.indexOf("a", 13));// a karakternin 13. indexten sonraki ilk indexini ver: 17




        /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        // "madem geldin dünyaya otur çalış JAVA'ya :)";
        System.out.println(str.indexOf("ya"));//16
        System.out.println(str.lastIndexOf("ya"));//37
        System.out.println(str.lastIndexOf("x"));//-1
        System.out.println(str.lastIndexOf(":"));//40

        /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamsını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Dadaş hele bir cümle  gir : ");
        String cumle = input.nextLine();

        if (cumle.indexOf("java") == -1) {//java yoksa index -1 ->java yokluk kontrolu
            System.out.println("girilen ifadede java bulunmaz ");

        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java")) {
            System.out.println("girilen ifadede java 1 tane bulunur ");

        } else System.out.println("girilen ifadede java 1'den çok bulunur ");



        //************Kendi Yazdıklarım******************
/* indexOf()
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */


        //str ="ibrahim"   str.indexof"b" b kaçıncı index cevap 1.index sonuç int dir.
        //str.indexof "a" 4
        String str1="madem geldin dünyaya otur çalış javaya :)";
        System.out.println(str1.indexOf(":"));//: 39 da
        System.out.println(str1.indexOf(":)"));//  ':) yo onedenle -1 bastı // :) 39 da
        System.out.println(str1.indexOf("x"));// x olmadığı için -1 bastı
        System.out.println(str1.indexOf("ya"));//ilk gördügü ya yı buldu 16 da
        //olmayan karakter için -1 verir



        /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        //lastIndexOf sondan gelir , index hep soldan başlar ama sona yakın ya yi getirir. index of baştan bakar.
        System.out.println(str.indexOf("ya"));//baştaki ya 16 da
        System.out.println(str.lastIndexOf("ya"));//sondaki ya 36 da
        System.out.println(str.lastIndexOf("x"));//-1 yok çünkü
        System.out.println(str.lastIndexOf(":"));//40



    }
}
