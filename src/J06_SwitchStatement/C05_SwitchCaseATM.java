package J06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCaseATM {
    public static void main(String[] args) {
        /*
        Task ATM bakiye 1000 Dolar olan bir banka hesabı için bakiye öğrenme
        para yatırma para çekme ve çıkış işlemlerinin yapıldığı bir code creat ediniz
         */
        int bakiye =1000;
        System.out.println("    ****     "  );
        System.out.println("Java Banka Hoş Geldiniz");
        Scanner scan =  new Scanner(System.in);
        System.out.println("Dadaş hele Ne istersin de\nBakiye için 1\nPara Yatırmak İçin 2\nPara Çekme İçin 3\nÇıkış 4");

        int tercih =scan.nextInt();


        switch (tercih) {
            case 1://Bakiye Verme İşlemi
                System.out.println("Bakiyeniz =" +bakiye);
                break;
            case 2://Para Yatırma İşlemi
                System.out.println("gardaş nekadar yatıracaksın");
                int yatırılanMiktar=scan.nextInt();
                bakiye+=yatırılanMiktar;
                System.out.println("Yeni Bakiyeniz =" +bakiye);
                break;
            case 3://Para Çekme İşlemi
                System.out.println("gardaş nekadar çekeceksin");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar<=bakiye) {
                    bakiye-=cekilenMiktar;
                    System.out.println("Yeni Bakiyeniz =" +bakiye);
                } else System.out.println("Gardaş olmayan Parayamı çekiyorsun");

                break;
            case 4://Çıkma İşlemi
                System.out.println("gardaş yine bekleriz");
                break;
            default:System.out.println("Gardaş atm ye ilk mez mi geliyon");




        }


        System.out.println("Kod Cıncık");

    }



}
