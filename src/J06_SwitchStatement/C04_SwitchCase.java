package J06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        //Task Girilen Ay numarasına göre Mevsimini print eden code creat ediniz.

        Scanner scan =  new Scanner(System.in);
        System.out.println("Dadaş hele Bir aySayi gir");
       String aySayi =scan.next();

        switch (aySayi) {
            case "1":
            case "2":
            case "12":
                System.out.println("Girilen ay KIŞ ayına ait");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Girilen ay ilk bahar ayına ait");
                break;
            case "6":

            case "7":
            case "8":
                System.out.println("Girilen ay Yaz ayına ait");
                break;
            case "9":
                case "10":
            case "11":
                System.out.println("Girilen ay Son Bahar ayına ait");
                break;

         //      if (yil %4==0   ) {
         //          System.out.println("Girilen Ayda 29 gün var");
         //      }else System.out.println("Girilen Ayda 28 gün var");
           //     System.out.println(yil % 4 == 0 ? "Girilen Ayda 29 gün var" : "Girilen Ayda 28 gün var");
            default://switch hiçbir case için çalışmazsa devreye girer. Defaultun switch blokta yeri önemli değildir.                System.out.println("Kurban olam Düzgün bir şey gir ");

        }





        System.out.println("Kod Cıncık");


    }
}
