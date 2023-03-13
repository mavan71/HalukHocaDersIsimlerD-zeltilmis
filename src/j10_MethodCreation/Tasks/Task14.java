package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /* task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
            ücretHesaplama();
    }

    private static void ücretHesaplama() {
        Scanner input = new Scanner(System.in);
        System.out.println("Saatlik Çalışma Ücretini giriniz");
        double saatlikUcret=input.nextDouble();
        System.out.println( "Fazla Çalışma çarpanı giriniz");
        double mesaiUcreti=input.nextDouble();
        System.out.println("işe hangi saatte başladınız");
        double işeBaşlamaSaati=input.nextDouble();
        System.out.println("işi hangi saatte bitirdiniz");
        double işiBitirmeSaati=input.nextDouble();

            if(işiBitirmeSaati<=17){
                double normalUcret=(işiBitirmeSaati-işeBaşlamaSaati)*saatlikUcret;
                System.out.println(normalUcret);
            }else  {
                double normalUcret=(17-işeBaşlamaSaati)*saatlikUcret;
                double fazlaMesafeUcreti=(işiBitirmeSaati-17)*saatlikUcret*mesaiUcreti;
                System.out.println(normalUcret+fazlaMesafeUcreti);

            }

    }


}
