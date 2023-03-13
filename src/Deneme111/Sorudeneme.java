package Deneme111;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorudeneme {
    public static void main(String[] args) {
/* TASK :
         Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
         toplamını bulan code create ediniz.
 */
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Gireceğiniz sayı miktarı giriniz: ");
        int lengthh= input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
            for (int i = 1; i <=lengthh ; i++) {
                System.out.print(i+". sayıyı giriniz: ");
                list.add(input.nextInt());
            }
            for (int i = 0; i <list.size(); i++) {  ///// ***********/////

                toplam+=(list.get(i) * list.get(i));
            }


        System.out.println(list);
        System.out.println(toplam);
    }
}


