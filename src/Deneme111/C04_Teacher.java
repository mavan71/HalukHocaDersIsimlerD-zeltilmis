package Deneme111;

import java.time.temporal.IsoFields;

public class C04_Teacher {//Ogretmen Obje Ogreten KalıppHane
    //POJO Class
    //Fields
    String ad;
    String name;
    String saoyad;
    String brans;
    int id;
    int tecrube;
    double maas;
    boolean emeklilik;
    public  void derssaati(){
        System.out.println("Ağam Haftalık 15 ders saati sonrası ekstraya girer");
    }

    public C04_Teacher(String ad, String saoyad, String brans, int id, int tecrube, double maas, boolean emeklilik) {
         /*
        Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
        this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
         Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
          Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
         */

        this.ad = ad;
        this.saoyad = saoyad;
        this.brans = brans;
        this.id = id;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emeklilik = emeklilik;
    }

    C04_Teacher(){

}
    @Override
    public String toString() {
        return

                "ad='" + ad + '\'' +
                ", saoyad='" + saoyad + '\'' +
                ", brans='" + brans + '\'' +
                ", id=" + id +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emeklilik=" + emeklilik;
    }

}
