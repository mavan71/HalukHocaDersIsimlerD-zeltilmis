package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Agam cinsiyet giresen" );
        String cns=scan.next();



        if(cns.equals("Kadın")) {
            System.out.println("Hanım Agam yaşını giresen" );
            int yas =scan.nextInt();
            if(yas>60){
                System.out.println("Agam primi giresen" );
                int prim =scan.nextInt();
                if(prim>6000){
                    System.out.println("tebrikler nenem nerde yedin emekli paralarını");

                }else System.out.println("Hanım Ağam emekliliğe =" +(6000-prim)+"eksik priminiz var");
            }else System.out.println("Hanım Ağam emekliliğe şu kadar yıl var =" +(60-yas)+"daha yılınız var"    );




        }else if (cns.equals("Erkek")){

            System.out.println("Agam yaşını giresen" );
            int yas =scan.nextInt();
            if(yas>65){
                System.out.println("Agam primi giresen" );
                int prim =scan.nextInt();
                if(prim>7000){
                    System.out.println("tebrikler dedem nerde yedin emekli paralarını");

                }else System.out.println("Ağam emekliliğe =" +(7000-prim)+"eksik priminiz var");
            }else System.out.println(" Ağam emekliliğe şu kadar yıl var =" +(65-yas)+"daha yılınız var"    );




        }else System.out.println("agam AYTA nın sana selamı var");
    }
}
