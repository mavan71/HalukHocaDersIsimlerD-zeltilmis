package Deneme111;

import java.util.Scanner;

public class Denemeternary {
    //Final notunu tanımlayan ternary ile çözünüz
  //'A' Gayet Başarılı 'B'Başarılı 'C'Hagayret diğerleri
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Geçme Notu Giriniz");
        //char basariNotu=input.next().charAt(0);
        String basariNotu=input.next();

      //  String sonuç=basariNotu.equalsIgnoreCase("A")?"Gayet Başarılı":(basariNotu.equalsIgnoreCase("B")?"Başarılı":
      //          (basariNotu.equalsIgnoreCase("C")?"Ha Gayret":"zayıf"));
      //  System.out.println("sonuç :" + sonuç);

      // if(basariNotu.equalsIgnoreCase("A")){
      //     System.out.println("Gayet Başarılı");
      // }else if(basariNotu.equalsIgnoreCase("B")){
      //     System.out.println("Başarılı");
      // }else if(basariNotu.equalsIgnoreCase("C")){
      //     System.out.println("Ha Gayret");
      // }else System.out.println("zayıf");
        switch(basariNotu){
            case"A":
            case "a":
                System.out.println("Gayet Başarılı");
                break;
            case"B":
            case "b":
                System.out.println("Başarılı");
                break;
                case"C":
            case "c":
                System.out.println("Gayet Başarılı");
                break;
            case"D":
            case "d":
                System.out.println("Gayet Başarılı");
                break;
            default:
                System.out.println("Hatalı Giriş");
        }
    }



}
//