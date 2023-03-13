package J08_Loops.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
        girilen sayının faktöriyeli  print eden code creat ediniz
        falan faktöriyel  1 den falana kadar tam sayıların çarpımıdır.
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi=input.nextInt();
        int factoriel=1;//1 etkisiz elemaman; int type variable tanımlandı
        for (int i=1;i<=sayi;i++) {
           factoriel*=i;
            }
            System.out.println("girdiğiniz sayının faktorıel  : " +factoriel);//dumy code hayalet code alta geçmesi için
        }

    }

