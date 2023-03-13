package J08_Loops.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Ağam tam sayı gir");
        int sayi=input.nextInt();


        int kareleriTop=0;

        for(int i=0; i<=sayi;i++){//girilen sayıya kadar loop tanımlandı
            kareleriTop+=i*i;

           // System.out.println(i);
            //System.out.println("ahanda tolam :" +top);
        }
        System.out.println("toplam :" + kareleriTop);


    }
}
