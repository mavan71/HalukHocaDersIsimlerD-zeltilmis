package Deneme111;

import java.util.Arrays;
import java.util.Scanner;

public class DenemeArrray2 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman
        // sayısını print eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Kaç elamanlı array gireceksin");
        int arrBoyut=input.nextInt();
            int arr[]=new int [arrBoyut];
            int toplam=0;
            int sayac=0;

        for (int i = 0; i <arrBoyut; i++) {
            System.out.println(i+" . indexi giriniz");
            arr[i]=input.nextInt();
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int ortalama=(toplam/arrBoyut);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortalama){
                sayac++;
            }

        }
 
        System.out.println(sayac);
        System.out.println(toplam);
        System.out.println(ortalama);
    }
    }

