package Deneme111;

public class C02_StaticBlok {
    static String isim="Murat AVAN";
    static {
        System.out.println("1. Blok update öncesi static Blok");
        System.out.println("1. Blok update sonrasıisim = " + isim);
        isim="Ahmet";
    }
    public static void main(String[] args) {

        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
        System.out.println("Main Başladı");
        isim="Mustafa";
        System.out.println("isim : " +isim);
        System.out.println("Main Bitti");

    }//main sonu
    static {
        System.out.println("2. Blok update öncesi static Blok");
        System.out.println("isim = " + isim);
        isim="Mehmet";
        System.out.println("2. Blok update sonrası isim = " + isim);
    }
}
