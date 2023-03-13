package Deneme111;

import java.util.Scanner;

public class DenemeWhileLoop2 {
    public static void main(String[] args) {
        //girilen bir sayıya kadar sayıları toplayıp print eden code giriniz
        Scanner input=new Scanner (System.in);
     //   System.out.println("Ağam bir sayi gir");
     //   int sayi=input.nextInt();
//
     //   int toplam=0;
     //   while(sayi>=0) {
     //   toplam+=sayi;
     //   sayi--;
//
        //}
     //   System.out.println(toplam);
        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz

  //  System.out.println("Ağam bir sayi gir");
  //  int sayi1=input.nextInt();
  //  int faktoriyel=1;
  //  while(sayi1>0){
  //      faktoriyel*=sayi1;
  //      sayi1--;
  //  }
  //  System.out.println(faktoriyel);
        //task-> girilen tamsayının rakamları toplamını print eden code create ediniz..
    //    System.out.println("Ağam bir sayi gir");
  //     int sayi2=input.nextInt();
  //     int toplam1=0;

  //     while (sayi2>0){
  //         toplam1+=sayi2%10;
  //         sayi2=sayi2/10;
  //     }
  //     System.out.println(toplam1);


        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
    //  System.out.println("Ağam bir sayi gir");
    //  int sayi3=input.nextInt();
    //  int tamBolenSyaisi=1;
    //  int tamBolenAdedi=0;
    //  while(tamBolenSyaisi<=sayi3){

    //      if(sayi3%tamBolenSyaisi==0){
    //          tamBolenAdedi++;
    //      }

    //      tamBolenSyaisi++;
    //  }
    //  System.out.println("Ağam girdiğin Sayinin "+tamBolenAdedi+" boleni var");

//task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz
   //int i=100;

   //       while (i<1000) {
   //       if(i%4==0){
   //           System.out.print(i+" ");

   //       }
   //           i++;
   //       }
// task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz.


     //  int toplam2=0;
     //  int sayac=0;
     //  while(toplam2<333){
     //      System.out.println("Ağam bir sayi gir");
     //      int sayi4= input.nextInt();
     //      toplam2+=sayi4;
     //      sayac++;
     //  }
     //  System.out.println("Ağam Yeter Gari "+sayac+"sayi girdin bu sayıların toplamı "+toplam2 +" dir");

      // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

 // int sayiAdedi=0;
 // int enBuyukSayi=0;
 // while (sayiAdedi<7){
 //     System.out.println("Ağam bir sayi gir");
 //     int sayi4= input.nextInt();
 //     sayiAdedi++;
 //     if (enBuyukSayi<sayi4){
 //         enBuyukSayi=sayi4;
 //     }
 // }
 // System.out.println("ağam girdiğin sayiların en büyüğü "+enBuyukSayi+" dır");

 //   int bykSayi = 0;


 //   int sayac = 1;

 //   while (sayac<= 7) {

 //       System.out.print(sayac + ". sayi giriniz : ");

 //        int girilenSayi = input.nextInt();
 //       bykSayi = (bykSayi > girilenSayi ? bykSayi : girilenSayi);

 //       //bykSayi = Math.max(input.nextInt(), bykSayi);//hangi sayı maximumise o sayıbykSayi olarak atanır

 //       sayac++;
 //   }
 //   System.out.println("bykSayi = " + bykSayi);

//task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80
     //  System.out.println("Ağam hele sayi gir");
     //  int sayi5=input.nextInt();
     //   int sayi6=1;
     //   while (sayi6<=10){
     //       System.out.println(sayi5+" X "+sayi6+"="+sayi5*sayi6);
     //       sayi6++;
     //   }
//Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        System.out.println("Ağam ismini ve soy ismini gir");
         String isim=input.nextLine();
         String fulName=  isim.toUpperCase();
        System.out.println(fulName);
        // // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String  str1= "$13.99";
        String str2= "$10.55";
        //// ipucu: Double parseDouble() methodunu kullanabilirsiniz.
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);
        double toplam=(sayi1+sayi2)/100;
        System.out.println("$"+toplam);


        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ece
         * output = cecece
         *
         * input = el
         * output = el
         */
      // System.out.println("Bir Kelime Gir");
      // String str3=input.nextLine();
      // String sonIkiHarf=str3.substring(str3.length()-2);
      // if(str3.length()>=3){
      //     System.out.println(sonIkiHarf);
      // }else System.out.println(str3);
      /*
       * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

    // System.out.println("4 Kelime giriniz");
    // String a=input.nextLine();
    // String b=input.nextLine();
    // String c=input.nextLine();
    // String d=input.nextLine();

    // System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b+" "+c+" "+d+".");
/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)
       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/
        System.out.println("Bir kelime giriniz");
        String str4=input.nextLine().toLowerCase();
        if(str4.startsWith("gh")){
            System.out.println(str4);
        }else if (str4.charAt(0)=='g'){
            System.out.println(str4.charAt(0)+str4.substring(2,str4.length()));
        }else if(str4.charAt(1)=='h'){
            System.out.println(str4.charAt(1)+str4.substring(2,str4.length()));

        }else System.out.println(str4.substring(2,str4.length()));
    }
    }

