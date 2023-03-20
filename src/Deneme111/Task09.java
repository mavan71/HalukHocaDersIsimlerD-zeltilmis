package Deneme111;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {

     /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
     public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
         System.out.println("Ağam Listeye Atamak için sayi giriniz\n Ağam Yeter diyisen w giriniz");
         String girilenSayi="";
          int topla=0;
         ArrayList<String>list =new ArrayList<>();
          while (!girilenSayi.equalsIgnoreCase("w")){
              System.out.println("Ağam sayi giresen");
           girilenSayi=input.nextLine();
              list.add(girilenSayi);
          }
         System.out.println("Ağam işte listin : " + list);
          list.remove(list.size()-1);
         System.out.println("w siz list = " + list);

         for (int i = 0; i < list.size(); i++) {
             int sayi=Integer.parseInt(list.get(i));
             topla+=sayi*sayi;
         }
         System.out.println("topla = " + topla);
     }
}
