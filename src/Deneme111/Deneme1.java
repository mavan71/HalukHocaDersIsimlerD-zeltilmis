package Deneme111;

import java.util.Scanner;

public class Deneme1 {



    private static void methodB(int i, double i1) {
        System.out.println("Method B Çalıştı");
    }

    private static void methodA(double i) {
        System.out.println("Method AB Çalıştı");
    }
    //girilen bir ifadede ki harf sayısını bulma
    public static void main(String[] args) {
     //  Scanner input = new Scanner(System.in);
     //  System.out.println("Bir String Gir");
     //  String str = input.nextLine();
     //  System.out.println("Hangi Harfi Saydıracaksım");
     //  char harf = input.nextLine().charAt(0);
     //  int harfSayısı = 0;




     //  for (int i = 0; i <= str.length() - 1; i++) {
     //      if (str.charAt(i) == harf) {
     //          harfSayısı++;
     //      }
     //  }System.out.println("İstediğin " + harf+" " + harfSayısı +" "+ "kadar vardı");
    //    //girilen sayının faktoriyeli hesaplanacak
    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Bir Syaı Gir");
    //    int sayi=input.nextInt();
    //    int faktoriyel=1;
    //    for(int i=1;i<=sayi;i++){
    //        faktoriyel*=i;
    //
    //    }
    //    System.out.println(" girilen sayının faktoriyeli "+faktoriyel);

     //   Scanner input = new Scanner(System.in);
     //   System.out.println("Bir Boyut Gir");
     //   int boyut=input.nextInt();
//
     //   for (int i=1; i<=boyut; i++) {
     //       for (int j=1;j<=boyut; j++) {
     //           System.out.print((i*j)+"\t");
     //       }
     //       System.out.println();
      //  }
    //    for(int i=1;i<=10;i++){
    //        for(int j=1;j<=10;j++){
    //            System.out.println(i+"x"+j+"="+(i*j));
    //        }
    //        System.out.println();
    //    }
//
     //  for(int i=1;i<=9;i++){
     //      for(int j=1;j<=5;j++){
     //          System.out.print("B  ");
     //      }
     //      System.out.println();
     //  }

    //   Scanner input = new Scanner(System.in);
    //   System.out.println("Birinci sayıyı Gir");
    //   int ilkSayi=input.nextInt();
    //   System.out.println("ikinci sayıyı Gir");
    //   int ikiciSayi=input.nextInt();
    //  // ilkSayi++;
    //   //ikiciSayi--;
    //   for(int i=(ilkSayi<ikiciSayi)?ilkSayi:ikiciSayi;i<=((ilkSayi>ikiciSayi)?ilkSayi:ikiciSayi);i++){

    //           System.out.print(i%2==0?i+" " : " ");


    //    }
       // girilen sayıdan 100 kadar olan sayılardan 4 e bolunenleri yazan code creat ediniz

     //  Scanner input = new Scanner(System.in);
     //  System.out.println("Birinci sayıyı Gir");
     //  int sayi=input.nextInt();
     //  if (sayi>=100) {
     //      System.out.println("100 den küçük sayı giriniz");}
     //  else{
     //      for (int i = sayi; i < 100; i++) {
     //          if (i % 4 == 0) {
     //              System.out.print(i + " ");
     //          }
     //      }
     //  }
     //  System.out.println("code cıncık");
        //41 kere maaşallah yazdıran code creat ediniz.
    //    for(int i=1;i<=41;i++){
    //        System.out.println(i+" .Maaşallah ");
    //    }
    //    System.out.println("code cincik");
        //2 basamaklı tek sayıları print eden code creat ediniz
    //   for(int i=0;i<100;i++){
    //       if(i>9&&i%2==1){
    //           System.out.print(i+" ");
    //       }
    //   }
    //   System.out.println();
    //  for(int i=11;i<100;i+=2){
    //     System.out.print(i+" ");
    //   System.out.println("Bu loop çalışmaz");
    //   }
    //   Scanner input = new Scanner(System.in);
    //   System.out.println("Birinci sayıyı Gir");
    //   String str=input.nextLine ();
    //   int sayac=0;
    //   for(int i=0; i<=str.length()-1;i++){
    //       if(str.charAt(i)!=' '){
    //           sayac++;
    //       }
    //   }
    //   System.out.println("metin length =" +str.length() );
    //   System.out.println(str.replaceAll("\\s", ""));
    //   System.out.println(str.replaceAll("\\S","*"));
    //   System.out.println("sayac =" +sayac);
    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Ad Soyad Gir");
    //    String str=input.nextLine ();
    //    System.out.println("Adınız :" +str.substring(0,str.indexOf(" ")));
    //    System.out.println("Sosy Adınız :" +str.substring(str.indexOf(" ")+1));

        //girilen harfin 3 harfli ve benzersiz olduğu nu control edn code creat ediiniz (ternary)
     //  Scanner input = new Scanner(System.in);
     //  System.out.println("Bir metin Gir");
     //  String str=input.nextLine ();
     //  System.out.println(str.length() == 3 ? ((str.charAt(0) != str.charAt(1)) &&
     //          (str.charAt(0) != str.charAt(2)) &&
     //          (str.charAt(1) != str.charAt(2))) ? " girilen metin farklı harflerden oluşuyor" :
     //          "girilen metin farklı harflerden oluşmuyor " : "girilen metin 3 harfli değil");

        //girilen sitringin ilk yarısını yazan code creat ediniz
     //   Scanner input = new Scanner(System.in);
     //   System.out.println("Bir metin Gir");
     //   String str=input.nextLine ();
     //   System.out.println(str.substring(0, str.length()/ 2));
     //   System.out.println(str.substring(str.length()/ 2));


        methodA(25);
        methodA(12.5);
        methodB(12, 25);
        methodB(12, 12.5);
        StringBuilder str1=new StringBuilder("AVATAR");
        System.out.println("str1.subSequence(2,4) = " + str1.subSequence(2, 4));
        System.out.println("str1.subSequence(0,4) = " + str1.subSequence(0, 4));
        str1.reverse();
        str1.deleteCharAt(2);
        System.out.println(str1);

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("WelcomeGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get subSequence between index 0 to 7
        // using subSequence() and print
        System.out.println("SubSequence = "
                + str.subSequence(0, 7));



    }



}



