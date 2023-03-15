package Deneme111;

import j21_StaticKeyword.C01_Ogretmen;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_OgretmenClass.okulAdi="Clarusway";
        System.out.println("C01_OgretmenClass.okulAdi = " + C01_OgretmenClass.okulAdi);
        C01_OgretmenClass ogrt1=new C01_OgretmenClass("Murat ",12);
        System.out.println("ogrt1.isim = " + ogrt1.isim);
        System.out.println("ogrt1.tecrube = " + ogrt1.tecrube);
        ogrt1.evlilikYıldonumu();
        C01_OgretmenClass.maasHesabı();
        C01_OgretmenClass.okulAdi="Kabataş";

        C01_OgretmenClass ogrt2=new C01_OgretmenClass("Aydın",7);
        System.out.println("ogrt2.isim = " + ogrt2.isim);
        System.out.println("ogrt2.tecrube = " + ogrt2.tecrube);
    }
}
