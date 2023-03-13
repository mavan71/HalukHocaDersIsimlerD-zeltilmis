package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/
dikÜçgenMi();


    }

    private static void dikÜçgenMi() {
        Scanner input=new Scanner(System.in);
        System.out.println("1. Kenarı giriniz");
        int birinciKenar=input.nextInt();
        System.out.println("2. Kenarı giriniz");
        int ikinciKenar=input.nextInt();
        System.out.println("3. Kenarı giriniz");
        int üçüncüKenar=input.nextInt();
     // int büyükKenar= birinciKenar>ikinciKenar?(birinciKenar>üçüncüKenar?birinciKenar:üçüncüKenar):
              //(ikinciKenar>üçüncüKenar?ikinciKenar:üçüncüKenar);
      if((birinciKenar*birinciKenar)==(ikinciKenar*ikinciKenar)+(üçüncüKenar*üçüncüKenar)){
          System.out.println("üçgen Dik Üçgendir");
      } else if ((ikinciKenar*ikinciKenar)==(birinciKenar*birinciKenar)+(üçüncüKenar*üçüncüKenar)) {
          System.out.println("üçgen Dik Üçgendir");
      } else if ((üçüncüKenar*üçüncüKenar)==(birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar)) {
          System.out.println("üçgen Dik Üçgendir");
      }else {
          System.out.println("üçgen Dik Üçgen değildir");
      }
    }
}
