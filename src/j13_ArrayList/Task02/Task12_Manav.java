package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    static ArrayList<String>urunList= new ArrayList<>(List.of("Muz için 1, Muz Fiyatı 19TL\nElma için 2, Elma 15TL\nErik için 3, Eric 17TL\nPortakal için 4, Portakal 18TL\nKiwi için 5, Kiwi 11TL\n Çıkış için 0 "));
    static ArrayList<Integer>urunListFiyati= new ArrayList<>(List.of(19,15,17,18,11));
    static int toplamFiyat=0;
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        alisVerisYap(urunList,urunListFiyati);


    }

    private static void alisVerisYap(ArrayList<String> urunList, ArrayList<Integer> urunListFiyati) {
        System.out.println("urunList = " + urunList);
        System.out.println("Ağam BirÜrün Seç");
        int secim=input.nextInt();
        System.out.println("urunListFiyati = " + urunListFiyati);
        System.out.println("Ağam Kaç Kilo alacağan");
        int kilosecim=input.nextInt();
        switch (secim){
            case 1:
                toplamFiyat+=kilosecim*19;
                break;
            case 2:
                toplamFiyat+=kilosecim*15;
                break;
            case 3:
                toplamFiyat+=kilosecim*17;
                break;
            case 4:
                toplamFiyat+=kilosecim*18;
                break;

            case 5:
                toplamFiyat+=kilosecim*11;
                break;
            case 0:

                break;
        }
            alisVeriseDevamMı();



    }

    private static void alisVeriseDevamMı() {

        System.out.println("Alış Verişe Devam Edecekseniz 1\nAlışverişi Bitirecekseniz 2\nLütfen Seçim Yapınız");
        int secim2=input.nextInt();
        if(secim2==1){
            alisVerisYap(urunList,urunListFiyati);
        }else if(secim2==2){
            System.out.println("toplamFiyat = " + toplamFiyat);
        }else System.out.println("Lütfen doğru tercih yapınız");



    }


}

