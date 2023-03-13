package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


          /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */

        basamakSayisiKac();


    }

    private static void basamakSayisiKac() {
        System.out.println("Lütfen bir tam sayı giriniz :");
        int sayi= scan.nextInt();
        int sayac=0;
        while (sayi>0){
            sayi/=10;
          sayac++;
       }
      //  for (int i = 1; 0 <sayi ; i++) {
//
      //      sayac++;
      //      sayi/=10;

        //}


        System.out.println("Girdiğiniz sayı " + sayac + " basamaklıdır");
    }
}