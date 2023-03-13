package J06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

//Verilen bir rakamın Harf Karekteri ile print eden code create ediniz.
        Scanner scan =  new Scanner(System.in);

        System.out.println("Dadaş hele Bir Sayi gir");
        int  sayi =scan.nextInt();
                //0 ->sout (sıfır)
        //1 sout (Bir )   if (sayi==0) {sout}
        System.out.println(" *** if *****");
        if (sayi==0) {
            System.out.println("sıfır");
        }else if (sayi==1) {
            System.out.println("");
        }else if (sayi==2) {
            System.out.println("iki");
        }else if (sayi==3) {
            System.out.println("üç");
        }else if (sayi==4) {
            System.out.println("dört");
        }else if (sayi==5) {
            System.out.println("beş");
        }else if (sayi==6) {
            System.out.println("altı");
        }else if (sayi==7) {
            System.out.println("yedi");
        }else if (sayi==8) {
            System.out.println("sekiz");
        }else if (sayi==9) {
            System.out.println("dokuz");
        }

        System.out.println(" *** Switch *****");
        switch (sayi ){
            case 0:
                System.out.println("sıfır");
               // break;// Kode blogu bu komutla kırılır
            case 1:
                System.out.println("bir");
               // break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
               // break;
            default://switch hiçbir case için çalışmazsa devreye girir.

                System.out.println("Canın yiyim Ne Yazısen");


        }

        System.out.println("Kode Cıncık");
    }


}
