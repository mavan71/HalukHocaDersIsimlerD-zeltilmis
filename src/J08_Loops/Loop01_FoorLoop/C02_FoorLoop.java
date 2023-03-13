package J08_Loops.Loop01_FoorLoop;

import java.util.Scanner;

public class C02_FoorLoop {
    public static void main(String[] args) {



        //girilen sayıdan 100 e kadar 4 dün katı olan tam sayıları
        // print eden code creat ediniz
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi=input.nextInt();
        if (sayi>=100){
            System.out.println("Hatalı giriş");

        }else
        for( int i=sayi;i<100 ;i ++ ){
            if(i%4==0){
                System.out.print(i +" ");
            }

        }
    }


}
