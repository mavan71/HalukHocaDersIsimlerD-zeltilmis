package Deneme111;

import java.util.Scanner;

public class DenemeSwitch {
    //girilen 3 basamaklı sayının okunuşunu yazan program giriniz
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("3 rakamlı bir sayı giriniz");
        int sayi=input.nextInt();
        if(sayi>99&&sayi<1000){
            int birlerBas=sayi%10;
            int yuzlerBas=(sayi/100);
            int onlarBas=(sayi/10)%10;
            switch(yuzlerBas){
                case 1:System.out.println("yuz "); break;
                case 2:System.out.println("iki yuz "); break;
                case 3:System.out.println("uc yuz "); break;
                case 4:System.out.println("dort yuz "); break;
                case 5:System.out.println("beş yuz "); break;
                case 6:System.out.println("altı yuz "); break;
                case 7:System.out.println("yedi yuz "); break;
                case 8:System.out.println("sekiz yuz "); break;
                case 9:System.out.println("dokuz yuz "); break;
            }
                switch(onlarBas){

                    case 1:System.out.println("on "); break;
                    case 2:System.out.println("yirmi "); break;
                    case 3:System.out.println("otuz "); break;
                    case 4:System.out.println("kırk "); break;
                    case 5:System.out.println("elli "); break;
                    case 6:System.out.println("altmış "); break;
                    case 7:System.out.println("yetmiş "); break;
                    case 8:System.out.println("seksen "); break;
                    case 9:System.out.println("doksan "); break;
            }
            switch(birlerBas){

                case 1:System.out.println("bir "); break;
                case 2:System.out.println("iki "); break;
                case 3:System.out.println("uç "); break;
                case 4:System.out.println("dort "); break;
                case 5:System.out.println("beş "); break;
                case 6:System.out.println("altı "); break;
                case 7:System.out.println("yedi "); break;
                case 8:System.out.println("sekiz "); break;
                case 9:System.out.println("dokuz "); break;
            }

        }else System.out.println("Hatalı Giriş");

    }

}
