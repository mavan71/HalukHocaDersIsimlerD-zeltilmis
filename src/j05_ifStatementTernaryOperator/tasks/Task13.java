package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Agam Bir Sayı giresen" );
        int sayi1= scan.nextInt();

        System.out.println("Agam Bir Sayı daha giresen" );
        int sayi2= scan.nextInt();
        System.out.println("agam\n + için ->1 seçiniz\n- için ->2 seçiniz\n* için ->3 seçiniz\n/ için ->4 seçiniz\n");
        int islem =scan.nextInt();

        if(islem==1){
            System.out.println("Toplama :"+sayi1+" + "+sayi2+" = "+(sayi1+sayi2));
        }if(islem==2){
            System.out.println("Çıkarma :"+sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
        }if(islem==3){
            System.out.println("Çarpma :"+sayi1+" * "+sayi2+" = "+(sayi1*sayi2));
        }if(islem==4){
            System.out.println("Bölme :"+sayi1+" / "+sayi2+" = "+(sayi1/sayi2));
        }else System.out.println("Agam ne istedigini bilmisen");



    }
}
