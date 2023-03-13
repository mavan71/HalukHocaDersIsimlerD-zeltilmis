package Deneme111;

import java.util.Scanner;

public class Deneme2Method {
    static Scanner input=new Scanner (System.in);
    static int bakiye=1500;
    public static void islemTercihi(){
        System.out.println("Yapacağınız İşlemi Seçiniz");
        int seçim=input.nextInt();

        switch (seçim){
            case 1:
                bakiyeSorgulama();
                sonKarar();

                break;
            case 2:
                System.out.println("Para Yatırma İşleminiz Yapılıyor");
                System.out.println("Nekadar Yatıracaksınız :");
                int yatırılanMiktar=input.nextInt();
                bakiye=bakiye+yatırılanMiktar;
                System.out.println("Para Yatırma İşleminiz Yapıldı");
                sonKarar();
                break;

            case 3:
                paraÇekme();
                sonKarar();
                break;

            case 4:
                çıkış();
                break;
            default:
                System.out.println("Uygun Seçim Yapınız ");
        }//switch sonu




    }//Method sonu

    private static void paraÇekme() {
        System.out.println("Çekeceğiniz Miktarı Giriniz.");
        int çekilenMiktar=input.nextInt();
        if(çekilenMiktar<=bakiye){
            bakiye-=çekilenMiktar;
            System.out.println("Para Çekme İşleminiz Başarıyla Tamamlandı");
        } else
            System.out.println("Çekmek istedğiniz tutar için hesabınız yetersiz");
    }

    private static void çıkış() {
        System.out.println("Çıkış İşleminiz Yapılıyor");

        System.out.println("Çıkış İşleminiz Yapıldı");
    }

    public static void bakiyeSorgulama() {
        System.out.println("Bakiye Sorgulama İşleminiz Yapılıyor");
        System.out.println("Bakiyeniz :" +bakiye);
        System.out.println("Bakiye Sorgulama İşleminiz Yapıldı");

    }
    public static void sonKarar(){
        System.out.println("İşlemler devam edecekseniz ->1 'e bitirecekseniz 0'a basınız ");
        int seçim2=input.nextInt();
        if(seçim2==1){
            islemTercihi();
        }else if (seçim2==0){
            çıkış();
        }else System.out.println("Hatalı Giriş yaptınız");

    }


}
