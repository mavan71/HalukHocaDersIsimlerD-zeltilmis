package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    public static void main(String[] args) {
/*
   Task-> vucüt kitleendexini print eden METHOD create ediniz
   vki->kg(mt*mt)
18,5 kg/m2 ve daha düşük değerler = Zayıf.
18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
30,0 ve üstü =  obezite.

    */
        vkiHesapla();


    }//main sonu

    private static void vkiHesapla() {
        System.out.println("kilonuzu kğ olarak giriniz : ");
        double kilo=input.nextDouble();
        System.out.println("boyunuzu metre olarak giriniz : ");
        double boy=input.nextDouble();
        double vki=kilo/(boy*boy);
        System.out.println("vki = " + vki);
        if (vki<=18.5){
            System.out.println("fitsiniz : ");
        }else if (vki<=24.9){
            System.out.println("normalsin");
        }else if (vki<=29.9){
            System.out.println("Hamır yeme");
        }else System.out.println("Mezarda kurtlar sevinsin");

    }
}//class sonu
