package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Agam ehliyetin Var ise E yoğ ise H giresen" );
        char ehliyet=scan.nextLine().charAt(0);

        if(ehliyet == 'E' || ehliyet == 'e') {
            System.out.println("Agam kaç yıllık süfersin" );
            int tcrbYıl= scan.nextInt();
            if(tcrbYıl>=7){
                System.out.println("Agam kaç km lik süfersin" );
                int km=scan.nextInt();
                if(km>=100000) {
                    System.out.println("Agam Anahtar Senin Hayırlı Olsun" );
                }else System.out.println("agam kontak alman için " +(100000-km)+ "Mesafe eksikliğin var");
            }else System.out.println("agam kontak alman için " +(7-tcrbYıl)+ "tecrübe eksikliğin var");




        }else if(ehliyet == 'H' || ehliyet == 'h') {
            System.out.println("agam kontak alamazsın");

        }else System.out.println("Agam oraya gelmeyim adam gibi E H giresen" );




}
}
