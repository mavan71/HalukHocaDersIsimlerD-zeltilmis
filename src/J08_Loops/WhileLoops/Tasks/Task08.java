package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        Scanner input = new Scanner(System.in);
        System.out.print("Ağam şifre Gir: ");
        String sifre= input.nextLine();

                if(sifre.charAt(0)>= 'a' && sifre.charAt(0) <= 'z'){

                }else System.out.println(("İlk Harf kücük olmalı"));
                if(sifre.charAt(sifre.length()-1)>= '0' && sifre.charAt(sifre.length()-1) <= '9'){

                }else System.out.println(("Son karakter rakam olmalı"));

                if(!sifre.contains(" ")){

                }else System.out.println(("Boşluk olmamalı"));

                if(sifre.length()>=10){

                }else System.out.println(("Uzunluk en az 10 karakter olmalı"));

        System.out.println("Şifre Başarılı");
    }
}
