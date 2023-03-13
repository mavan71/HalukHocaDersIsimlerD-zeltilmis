package J07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /* String içerisinde istenen Stringini varlığını kontrol ederbooelean değer return eder*/
        String str ="başarı gayrete aşıktır";
        System.out.println(str.contains(("başarı")));//true verir
        System.out.println(str.contains(("Başarı")));//false  verir
        System.out.println(str.contains((" ")));//true  verir
        System.out.println(str.contains(("")));//true  verir
        String str1="başarı";
        str1.contains(str); //str1 str yi içerir False
        str.contains(str1);//str str1 i içerir True
        str.contains(str);//str str i içerir.True
        //girilen bir metinde kelimenin varlığı nı kontrol eden code creat ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = scan.nextLine();
        System.out.println("Bir kelime girinz");
        String kelime= scan.nextLine();
        System.out.println(metin.contains(kelime) ? "girilen metinde kelime mevcutmu" : "girilen metinde istenen kelime mevcut değil");


    }

}
