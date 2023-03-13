package J06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        //Task Girilen Ay numarasına göre kaç gün çektiğini print eden code creat ediniz.

        Scanner scan =  new Scanner(System.in);
        System.out.println("Dadaş hele Bir Sayi gir");
        int  aySayi =scan.nextInt();

        switch (aySayi) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen Ayda 31 gün var");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen Ayda 30 gün var");
                break;
            case 2:
                System.out.println("Hele Yılını giresen");
                int yil =scan.nextInt();

         //      if (yil %4==0   ) {
         //          System.out.println("Girilen Ayda 29 gün var");
         //      }else System.out.println("Girilen Ayda 28 gün var");
                System.out.println(yil % 4 == 0 ? "Girilen Ayda 29 gün var" : "Girilen Ayda 28 gün var");
            default://switch hiçbir case için çalışmazsa devreye girer. Defaultun switch blokta yeri önemli değildir.                System.out.println("Kurban olam Düzgün bir şey gir ");

        }





        System.out.println("Kod Cıncık");


    }
}
