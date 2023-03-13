package J07_StringManipulation;

public class C06_Substring {//substring=parçalama
    public static void main(String[] args) {

 /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */

        String str="madem geldin dünyaya otur çalış javaya :)";
        str.substring(10);//ın dunyaya otur çalış javaya
        str.substring(10,17);//in düny alır (10 ile 17arasını alır)

        //str 2 deki son 10 karakteri print eden code creat ediniz

        System.out.println(str.substring(str.length() - 10));// 45 ise 10 ı çıkarır 35 karakter  yazar
//str 2 deki ilk 10 karakteri print eden code creat ediniz
        System.out.println(str.substring(0, 10)); //0 dan 9 a kadar 10 karakteri yazar
        //str 2 deki ilk  karakteri print eden code creat ediniz
        System.out.println(str.substring(0, 1));//0 m

//str 2 deki son  karakteri print eden code creat ediniz
        System.out.println(str.substring(str.length() - 1));//  ) çıkmalı


        //girilen 4 harfli kelimeyi ters den print eden code creat ediniz.Kale yazdıysanız elek yazsın

    }


}
