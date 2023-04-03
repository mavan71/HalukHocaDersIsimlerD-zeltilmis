package PROJECTS.ogrcOgrtYonetimMap02;

import java.util.Scanner;

import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.girisPaneli;
import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.işlemMenu;
import static PROJECTS.ogrcOgrtYonetimMap02.AnaMenu.kimlikIDKontrol;
import static PROJECTS.ogrcOgrtYonetimMap02.TcKontrol.kimlikNoDogrulama;


public class OgrenciIslemleri implements Ogrt_OğrcIslemleri{

  static   OgrenciIslemleri ogrcIslemObj =new OgrenciIslemleri();//class içindeki non-static meth coll etmek için obj create edildi
   public  static  void  ogrenciIslemMenu(){


       işlemMenu();

       System.out.print("ÖĞRENCİ işleminizi seçiniz : ");

       //int scm = TryCatches.integerGiris();               //try catch


       switch (TryCatches.integerGiris()) {

           case 1:
               ogrcIslemObj.ekleme();

               break;
           case 2:
               ogrcIslemObj.arama();

               break;
           case 3:
               ogrcIslemObj.listeleme();

               break;
           case 4:
               ogrcIslemObj.silme();

               break;
           case 5:
               ogrcIslemObj.anaMenu();

               break;
           case 6:
               ogrcIslemObj.cikis();

               break;
           default :
               System.out.println("lütfen geçerli bir giriş yapınız");

               ogrenciIslemMenu();
               break;

   }
   }




    @Override
    public void ekleme(){
          System.out.println("Lütfen Öğrenci kimlik numarası 11 haneli giriniz");

           String kimlikNo = new Scanner(System.in).next();
        if (kimlikNo.length()<11) {
            System.out.println("lütfen kimlik numarasını 11 hane olarak giriniz");

            ekleme();
        }

        kimlikNoDogrulama (kimlikNo);

           kimlikKontrol(kimlikNo);

           System.out.println("eklenecek ÖĞRENCİ Adını ve Soyadını Giriniz");



           // System.out.println("adSoyad");
        //new Scanner(System.in).nextLine();

           String adSoyad = new Scanner(System.in).nextLine();
           System.out.println("Yasını Giriniz");
           String yas = new Scanner(System.in).next();
           System.out.println("Numara Giriniz");
           String numara = new Scanner(System.in).next();
           System.out.println("Sinif Giriniz");
           String sinif = new Scanner(System.in).next();
       // Ogrenci.ogrenciListesiMap.put(kimlikNo,new Ogrenci(new Scanner(System.in).nextLine(),new Scanner(System.in).next(),new Scanner(System.in).next(),new Scanner(System.in).next()));
           Ogrenci.ogrenciListesiMap.put(kimlikNo, new Ogrenci(adSoyad, yas, numara, sinif));
        System.out.println("Öğrenci Ekleme İşleminiz Başarılı\nEklediğiniz Öğrenci\n"+Ogrenci.ogrenciListesiMap.get(kimlikNo));
        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
       }





    @Override
    public void arama() {
        System.out.print("aradıgını öğrenci kimlik numarası giriniz : ");
     String kimlikID = new Scanner(System.in).next();

       if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
       // if (Ogrenci.ogrenciListesiMap.containsKey( input.next())) {
           // System.out.println("aradıgınız öğrenci : "+Ogrenci.ogrenciListesiMap.get( input.next()));
            System.out.println("aradıgınız öğrenci : "+Ogrenci.ogrenciListesiMap.get( kimlikID));
        } else  System.out.println("aradıgınız öğrenci  kayıtlı degil ");
        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu(); }

    @Override
    public void listeleme() {
        System.out.println(Ogrenci.ogrenciListesiMap);
        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
    }

    @Override
    public void silme() {
        System.out.print("silinecek öğrenci kimlik numarası giriniz : ");
         String silinecekOgcId = new Scanner(System.in).next();
        //if (Ogrenci.ogrenciListesiMap.containsKey(silinecekOgcId)) {
        if (Ogrenci.ogrenciListesiMap.containsKey( silinecekOgcId)) {
            System.out.println("sildiğiniz öğrenci : "+Ogrenci.ogrenciListesiMap.remove(silinecekOgcId));
        } else System.out.println("silinecek öğrenci  kayıtlı degil...");

        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
    }

    @Override
    public void anaMenu() {
        girisPaneli();
    }


    @Override
    public void cikis() {
        System.out.println("Ogretmen - Öğrenci Yonetimi uygulama çıkışınız yapılmıştır selametle...");
    }
    public static void kimlikKontrol(String kimlikId){
       if(Ogrenci.ogrenciListesiMap.containsKey(kimlikId)||Ogretmen.ogretmenListesiMap.containsKey(kimlikId)){
           System.out.println( "Ağam BU kimlik daha önce girilmiş ");
       }
       AnaMenu.işlemMenu();

    }




}
