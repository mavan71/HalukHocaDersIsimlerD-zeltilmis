package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

        Scanner sc = new Scanner(System.in);

        int bykSayi = 0;
        int kckSayi = 0;

        int sayacFurkan = 1;

        while (sayacFurkan <= 7) {

            System.out.print(sayacFurkan + ". sayi giriniz : ");

            // int girilenSayi = sc.nextInt();
            //   bykSayi = (bykSayi > girilenSayi ? bykSayi : girilenSayi);

            bykSayi = Math.max(sc.nextInt(), bykSayi);//hangi sayı maximumise o sayıbykSayi olarak atanır

            sayacFurkan++;
        }
        System.out.println("bykSayi = " + bykSayi);


    }
}
