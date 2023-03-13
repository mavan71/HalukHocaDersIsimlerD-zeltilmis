package J08_Loops.WhileLoops;

import java.util.Scanner;

public class C01_whileLoops {

    public static void main(String[] args) {
          /*
     //  Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
     //  net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
     //   */
     //  //task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
     //  System.out.println("   ***   Task01   ***   ");
     //  int basla = 3;//while başlangıç değeri

     //  while (basla <= 20) {//basla 20den kucuk eşit oldugu surece sartı->true while body action alır
     //      System.out.print(basla + " ");//3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
     //      basla++;//while loop değişim komutu
     //  }

     //  // task02-> 7 kere javaCAN print eden code create ediniz
     //  System.out.println("   ***   Task02   ***   ");

     //  int b = 1;
     //  while (b <= 7) {
     //      System.out.println(b + ". javaCAN");
     //      b++;
     //  }
     //  // task03->2 basamaklı tek sayıları print eden code create ediniz
     //  System.out.println("   ***   Task03   ***   ");
     //  int bs = 10;
     //  while (bs <= 99) {

     //      if (bs%2==1) {
     //          System.out.print(bs+" ");
     //      }

     //      bs++;//her döngüde 1 artacak
     //  }

     //  // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
     //  System.out.println("   ***   Task04   ***   ");

     //  int c=1;
     //  while (c<10) {
     //      System.out.print(c+" ");
     //      c++;
     //  }

     //  // task05->girilen ifadeyi tersten  print eden code create ediniz
     //  System.out.println("   ***   Task05   ***   ");

     //  Scanner sc=new Scanner(System.in);

     //  System.out.print("gakgom bişey girisin : ");
     //  String bişey = sc.nextLine();
     //  int bişeyUzunluk=bişey.length();
     //  while (bişeyUzunluk>=1){
     //      System.out.print(bişey.charAt(bişeyUzunluk-1));
     //      bişeyUzunluk--;
     //  }
     //

        //****************Kendim Yaptığım bolum********
        /*
        Başlangıç bitiş değerleri bilinen değerlerin forloop ama adım sayısı yada değişim
        değeri net bilinmeyen belli bir şarta (duruma boolen)bağlı olan durumlarda tekrarlarda while kullanılır.
         */
        //3 den 20 adar tam sayıları proınt et
        //   int basla=3;//while başlangıç şartı
        //   while(basla<=20){//while başlangı şartı 20 ye eşit olana kadar true
        //       System.out.print(basla);//34567891011121314151617181920//true olanca badi sürekli çalışsır
        //       basla++;
//
        //       /*
        //  7 ker JavaCan yazan kod yaz


        //        int i=1;
        //        while(i<=7){
        //            System.out.println(i+"JavaCAN");
        //            i++;
        //        }
        // //iki basamaklı tek sayıları kod et

        //        int sayi=11;
        //        while(sayi<100){
        //            System.out.print(sayi+" " );
        //            sayi+=2;
        //     }
//1 basamaklı sayma sayılarını aynı satırda print eden code creat ediniz

        int c = 1;
        while (c < 10) {
            System.out.println(c + " ");
            c++;
        }



// task05->girilen ifadeyi tersten  print eden code create ediniz
     //   System.out.println("   ***   Task05   ***   ");

     //    Scanner sc=new Scanner(System.in);

     //   System.out.print("gakgom bişey girisin : ");
     //   String bişey = sc.nextLine();
     //    int bişeyUzunluk=bişey.length();
     //   while (bişeyUzunluk>=1){
     //       System.out.print(bişey.charAt(bişeyUzunluk-1));
     //      bişeyUzunluk--;
      //  }
      //  Scanner scan=new Scanner(System.in);
      //  System.out.println("Bişeyler giresen");
      //  String bisey=scan.nextLine();
      //  int biseyUzunluk=bisey.length();
      //  while(biseyUzunluk>=1){
      //      System.out.print(bisey.charAt(biseyUzunluk-1));
      //      biseyUzunluk--;
      //  }
//girilen sayıya kadar sayıları toplayan değerleri yazın
        Scanner scan1=new Scanner(System.in);
        System.out.println("Bişeyler giresen");
        int bisayi=scan1.nextInt();
        int top=0;
        while (bisayi>=0){
            top +=bisayi;
            bisayi--;
            System.out.println(top);


        }}}









