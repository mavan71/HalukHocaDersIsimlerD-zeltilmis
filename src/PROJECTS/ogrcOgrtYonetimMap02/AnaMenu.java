package PROJECTS.ogrcOgrtYonetimMap02;

import java.util.Scanner;

import static PROJECTS.ogrcOgrtYonetimMap02.OgrenciIslemleri.ogrenciIslemMenu;
import static PROJECTS.ogrcOgrtYonetimMap02.OgretmenIslemleri.ogretmenIslemMenu;


public class AnaMenu implements AnaMenuIslemler {
    static Scanner input = new Scanner(System.in);


    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";




    public static void girisPaneli() {
        AnaMenu menuObj = new AnaMenu();//class'dan non-static meth call için obj create edildi
        System.out.println(R + "========================== OKUL YONETİMİ =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "  |1-ÖĞRENCİ İŞLEMLERİ |           |2-ÖĞRETMEN İŞLEMLERİ |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "                    ____________________                    \n"
                + "                   |      Q-ÇIKIŞ       |                   \n"
                + "                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯                    \n"+ B
                +" ======================== HOŞ GELDİNİZ=======================\n"+R
        );


        System.out.print("lütfen seçiminizi yapınız : ");



        switch(input.next().toUpperCase()){
            case "1":
               menuObj.ogrenciIslemleri();
                break;
            case "2":
              menuObj.ogretmenIslemlerı();
                break;
            case "Q":
              menuObj.cikis();
                break;
            default :
                System.out.println("lütfen geçerli bir seçim yapınız");
                girisPaneli();
        }
    }
    public static void işlemMenu() {


        System.out.println("========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   |    1-EKLEME       |            |     2-ARAMA       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   |    3-LİSTELEME    |            |     4-SİLME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   |    5-ANA MENU     |            |     6-CIKIS       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n" +
                "========================== İŞLEMLER ========================" );




    }



    public static void kimlikIDKontrol(String kimlikID) {
        if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID) || Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
            System.out.println("Bu ID kayıt yapılmış");
            AnaMenu.girisPaneli();
        }


    }

    @Override
    public  void ogrenciIslemleri() {
        ogrenciIslemMenu();

    }

    @Override
    public void ogretmenIslemlerı() {
        ogretmenIslemMenu();
    }

    @Override
    public void cikis() {
        System.out.println("Ogretmen - Öğrenci Yonetimi uygulama çıkışınız yapılmıştır selametle...");
    }
}
