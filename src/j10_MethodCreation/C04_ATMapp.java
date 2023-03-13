package j10_MethodCreation;

import java.util.Scanner;

public class C04_ATMapp {
    static Scanner input = new Scanner(System.in);//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    static int bakiye = 1500;//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin

    public static void main(String[] args) {
        /*
        baslangıc bakıye $1500 sorgu, para çekme-yatırma ve çıkış işlemlerini yapan bir ATM app create ediniz.
         */
        System.out.println("     *****     ");
        System.out.println("     JavaBanka Hoşgeldiniz :)  ***    ");
        System.out.println("     *****     ");
        System.out.println("     İŞLEM MENÜ :-)\nBakiye Sorma 1\nPara Yatırma 2\nPara Çekme 3\nCıkıs 4   ");
        islemTercih();

    }//main sonu

public static void islemTercih(){
    System.out.println("Yapacağınız İşlemi Seçiniz : ");
    int secim=input.nextInt();
    switch (secim){
        case 1://bakiye sorgulama
            bakiyeSorgula();
            sonKarar();
            cikis();
            break;
        case 2://Para Yatırma
            System.out.println("Para Yatırma işleminiz yapılıyor ");
            System.out.println("Yatıracağınız miktarı girin ");
            int yatanMiktar=input.nextInt();
            bakiye+=yatanMiktar;
            System.out.println(yatanMiktar+"hesabınıza yatırılmıştır");
            bakiyeSorgula();
            System.out.println("");
            sonKarar();

            break;
        case 3://Para Çekme
            paraCek();
            sonKarar();

            break;
        case 4://cıkıs



            break;
        default:
            System.out.println("Hatalı giriş Yaptınız yeniden giriniz");
    }

}

    private static void paraCek() {
        System.out.println("Para Çekme işleminiz yapılıyor ");
        System.out.println("Çekmek istediğiniz miktarı giriniz");
        int cekilenMiktar=input.nextInt();
        if(cekilenMiktar<=bakiye){
            bakiye-=cekilenMiktar;
        }else System.out.println("Bakiye yeterli değil");

        System.out.println("Para Çekme işleminiz yapıldı ");
    }

    private static void cikis(){
    System.out.println("Çıkış işleminiz yapılıyor ");
    System.out.println("Çıkış işleminiz yapıldı ");
}
    public static void bakiyeSorgula(){
    System.out.println("     *****  bakiye sorgulama işlemindesiniz *****   ");
    System.out.println("bakiyeniz :"+bakiye);
    System.out.println("     *****  bakiye sorgulama işleminiz tamamlandı *****   ");
}
public static void sonKarar(){
    System.out.println("işlemlere devam etmek için 1 bitirmek için 0 seçiniz :");
    int sonKarar=input.nextInt();
    if(sonKarar==1){
        islemTercih();
    }else if(sonKarar==0){

    }else System.out.println("Hatalı giriş Yaptınız ");
}
}//Class sonu
