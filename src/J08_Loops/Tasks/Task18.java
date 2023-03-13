package J08_Loops.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

     //  Scanner input=new Scanner(System.in);
     //  System.out.println("Bir tam sayı giriniz");
     //  int sayi=input.nextInt();
     //  int sonuc=1;
     //  for(int i=1;i<=sayi;i*=3){
     //      sonuc=sayi/3;
     //          System.out.print(" "+i);


     //      }
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=input.nextInt();
        int sayac=0;

        for (int i = 3; i<=sayi;i*=3) {
            if (sayi==i) {
                sayac++;
            }
        }if(sayac==1){
            System.out.println("Girilen sayi 3 ün bir kuvvetidir.");
        }else System.out.println("3 ün kuvveti değildir.");



        }


    }

