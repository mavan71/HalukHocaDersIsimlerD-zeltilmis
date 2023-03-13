package J08_Loops.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sauyıları code yazınız
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi1=input.nextInt();
        System.out.println("Bir sayi girin");
        int sayi2=input.nextInt();

           for (int i=(sayi1<sayi2?sayi1 :sayi2);i<=(sayi1>sayi2?sayi1 :sayi2);i++){
               System.out.print(i%2==0? i+" ": " ");
       }

       }


    }



