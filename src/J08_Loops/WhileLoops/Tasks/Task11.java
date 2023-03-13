package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve
    toplamını print eden code create edinz.
    */

        Scanner input = new Scanner(System.in);
        int sayi= 1;
        int toplam=0;
        int sayac=0;
        while (sayi!=0){
            System.out.print("Bir sayı giriniz: ");
            sayi= input.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac+" adet sayı girdiniz.");
        System.out.println("Girilen sayıların toplamı = " + toplam);




    }
}
