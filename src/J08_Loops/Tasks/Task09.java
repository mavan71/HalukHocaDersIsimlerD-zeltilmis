package J08_Loops.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz :");
        int sayi = scan.nextInt();


        for (int i = 1; i <= sayi; i++) {//kat
            for (int j = 1; j <=i; j++) {//daire
                System.out.print(" * ");
            } System.out.println();


        }
    }
}
