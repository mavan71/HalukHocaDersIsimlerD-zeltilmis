package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 46, 44, 27, 21, 79, 31, 20, 58, 38, 59, 33));
        Scanner input = new Scanner(System.in);
        System.out.print("Agam hangı sayiyini varlıgını kontrol edirsen : ");
        int sayi = input.nextInt();

        boolean varMı = false;//bayrak aşağı

        for (int i = 0; i < list.size(); i++) {//loop list elemanlarının tekrar eder

            if (list.get(i) == sayi) {//list elemanlarının girilen sayıya eşitlik kontrolu
                varMı = true;//bayrak yukarı
                System.out.println("Agam OLAAA :) aradıgın sayi MEVCUT  ");
                break;
            }
        }
       if (!varMı) {//arana sayı listte olmayınca if body action alır
            System.out.println("AGAm olsa dükkan senin aradıgın sayı yoğğğ :( ");
       }

    }
}

