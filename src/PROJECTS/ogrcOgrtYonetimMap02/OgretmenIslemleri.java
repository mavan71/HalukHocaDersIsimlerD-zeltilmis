package PROJECTS.ogrcOgrtYonetimMap02;

import java.util.Scanner;

import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.girisPaneli;
import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.işlemMenu;
import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.kimlikIDKontrol;
import static PROJECTS.ogrcOgrtYonetimMap02.TcKontrol.kimlikNoDogrulama;


public class OgretmenIslemleri implements Ogrt_OğrcIslemleri {

    static   OgretmenIslemleri ogrtIslemObj =new OgretmenIslemleri();
    public  static  void ogretmenIslemMenu(){


        işlemMenu();
        System.out.print("ÖĞRETMEN işleminizi seçiniz : ");

        //int scm = TryCatches.integerGiris();               //try catch


        switch (TryCatches.integerGiris()) {

            case 1:
                ogrtIslemObj.ekleme();

                break;
            case 2:
                ogrtIslemObj.arama();

                break;
            case 3:
                ogrtIslemObj.listeleme();

                break;
            case 4:
                ogrtIslemObj.silme();

                break;
            case 5:
                ogrtIslemObj.anaMenu();

                break;
            case 6:
                ogrtIslemObj.cikis();

                break;
            default :
                System.out.println("lütfen geçerli bir giriş yapınız");

                ogretmenIslemMenu();
                break;

        }
    }




    @Override
    public void ekleme(){
        System.out.println("kimlik numarası giriniz");
        String kimlikID = new Scanner(System.in).next();
        if (kimlikID.length()<11) {
            System.out.println("lütfen kimlik numarasını 11 hane olarak giriniz");

            ekleme();
        }

        kimlikNoDogrulama (kimlikID);
        kimlikIDKontrol(kimlikID);
        System.out.println("adSoyad yas bolum sicil giriniz");
        // System.out.println("adSoyad");
        new Scanner(System.in).nextLine();
        String adSoyad = new Scanner(System.in).nextLine();
        System.out.println("yas");
        String yas = new Scanner(System.in).next();
        System.out.println("bolum");
        String bolum = new Scanner(System.in).next();
        System.out.println("sicil");
        String sicil = new Scanner(System.in).next();
        Ogretmen.ogretmenListesiMap.put(kimlikID, new Ogretmen(adSoyad, yas, bolum, sicil));
        System.out.println("Öğretmen Ekleme İşleminiz Başarılı\nEklediğiniz Öğretmen\n"+Ogretmen.ogretmenListesiMap.get(kimlikID));
        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }





    @Override
    public void arama() {
        System.out.print("aradıgını ÖĞRETMEN kimlik numarası giriniz : ");
        String kimlikID = new Scanner(System.in).next();
        if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
            // if (Ogrenci.ogrenciListesiMap.containsKey( input.next())) {
           // System.out.println("aradıgınız ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.get( input.next()));
            System.out.println("aradıgınız ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.get(kimlikID));
        } else  System.out.println("aradıgınız ÖĞRETMEN  kayıtlı degil ");
        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu(); }

    @Override
    public void listeleme() {
        System.out.println(Ogretmen.ogretmenListesiMap);
        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }

    @Override
    public void silme() {
        System.out.print("silinecek ÖĞRETMEN kimlik numarası giriniz : ");
         String kimlikID = new Scanner(System.in).next();
        if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
        //if (Ogretmen.ogretmenListesiMap.containsKey( input.next())) {
            System.out.println("sildiğiniz ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.remove( kimlikID));
        } else System.out.println("silinecek ÖĞRETMEN  kayıtlı degil...");

        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }

    @Override
    public void anaMenu() {

        girisPaneli();
    }

    @Override
    public void cikis() {
        System.out.println("Ogretmen - Öğrenci Yonetimi uygulama çıkışınız yapılmıştır selametle...");
    }

}
