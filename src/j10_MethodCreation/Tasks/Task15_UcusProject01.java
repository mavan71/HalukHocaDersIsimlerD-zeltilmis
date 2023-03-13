package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task15_UcusProject01 {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner input = new Scanner(System.in);//güneşimiz tüm gezegenler için ortak erişimde

    public static void main(String[] args) {

        BiletTarifesi();



    }

    private static void BiletTarifesi() {
        System.out.println("B şehrine gidecekseniz ->1 \nC şehrine gidecekseniz ->2"+
                "\nD şehrine gidecekseniz ->3" +"\ngiriniz");
        int gidilecekŞehir=input.nextInt();
        switch(gidilecekŞehir){
            case 1:
                double yeniYasÇarpanı=yasÇarpanı();
                gidişDönüşÇarpanı();
                double bŞehriücreti=yeniYasÇarpanı*gidişDönüşÇarpanı()*500*0.1;
                System.out.println("bŞehriücreti = " + bŞehriücreti);
                break;
            case 2:
                yasÇarpanı();
                gidişDönüşÇarpanı();
                double cŞehriücreti=yasÇarpanı()*gidişDönüşÇarpanı()*700*0.1;
                System.out.println("cŞehriücreti = " + cŞehriücreti);
                break;
            case 3:
                yasÇarpanı();
                gidişDönüşÇarpanı();
                double dŞehriücreti=yasÇarpanı()*gidişDönüşÇarpanı()*700*0.1;
                System.out.println("cŞehriücreti = " + dŞehriücreti);

                break;
        }
    }

    private static void şehirÇarpanı() {

    }

    private static double gidişDönüşÇarpanı() {
        System.out.println("GidişDönüşİçin ->1 \nTekYön ->2 \ngiriniz" );
        int tercih=input.nextInt();
        if(tercih==1){
            double gidisDonusÇarpanı= 0.80*2;
        }else {
            double tekYönÇarpanı=1;
        }return gidişDönüşÇarpanı();
    }

    private static double yasÇarpanı() {
        System.out.println("Yaşınızı Giriniz");
        int yas=input.nextInt();
        if(yas<12){
            double yasÇarpanı=0.5;

        }else if(yas<24){
            double yasÇarpanı=0.9;
        }else if(yas>65){
            double yasÇarpanı=0.7;
        }else {
            double yasÇarpanı=1;
        }return (yasÇarpanı());


    }

}
