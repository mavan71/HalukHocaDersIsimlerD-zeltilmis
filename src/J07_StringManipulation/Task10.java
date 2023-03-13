package J07_StringManipulation;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */


        Scanner scan =new Scanner(System.in);
        System.out.println("Bir İsiim girin");
        String isim=scan.nextLine().toUpperCase();

        System.out.println(isim.length() == 3 ? (isim.charAt(0) != isim.charAt(1) && isim.charAt(0) != isim.charAt(2) && isim.charAt(1) != isim.charAt(2)) ? "Harfler Farklı" : "Harfler Aynı" : "üc Karakterli değil");


    }




}
