package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C09_SwitchCase {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Ana Menu İçin 1 e \nİşlemler İçin 2 ye\nÇıkış İçin 3 e Basınız");
        int secim =scan.nextInt();

        if (secim==1) {
            System.out.println("Ana Menu"   );
        }else if (secim==2) {
            System.out.println("İşlemler");
        }else if (secim==3) {
            System.out.println("Çıkış");
        } else System.out.println("Hatalı giriş Yaptınız");


    // switch (secim) {
    //     case 1:
    //         System.out.println("Ana Menu"   );
    //         break;
    //     case 2:
    //         System.out.println("İşlemler");
    //         break;
    //     case 3:
    //         System.out.println("Çıkış");
    //         break;
    //     default:
    //             System.out.println("Hatalı Tuşa Bastınız");
    //             break;





        }




    }




