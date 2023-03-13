package J07_StringManipulation;

import java.util.Scanner;

public class C03_ChartAt {
    public static void main(String[] args) {
        /*
        chartAt methodu parametre int olarak girilen index deki char değerini return eder.
        Çoooggg önemli :index değeri her zaman 0 dan başlar
        Java hep sıfır dan başlar
         */

        String name="Abdi Arman";
        System.out.println("name.charAt(5) = " + name.charAt(5));//name Stringindeki 5. indexi karaktörü return eder
        char karakter=name.charAt(7);

        System.out.println("abdinin 7. karakteri =" + karakter);
        /*
         Java hep sıfır dan başlarsaymaya "Abdi Arma
                                           012345         5. A

                                           bir Stringin son karakteri Length-1 indexidir.
                    Girilen bir stringin ifadenin ortadaki karakterini print eden code creat ediniz.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Bir Şeyler giresin");
        String str=input.nextLine();
        if (str.length()%2==1) {
            System.out.println("Orta Karakter :" +str.charAt(str.length()/2));

            System.out.println("Girilen ifadenin orta karakteri yoktur");
        }

/*
Hocanın Notu*****************************************

/*
     //   charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
     //   Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
     //    */
     //   String name="Abdi Arman";
     //   System.out.println(name.charAt(5));//name Stringdeki 5. index karakteri return eder->A
     //   char karakter=name.charAt(7);
     //   System.out.println("abdinin 7. karakteri = " + karakter);//m
//
//
     //   //bir String ifadenin son karakteri ->charAt(length -1).indexdir.
     //   // length hesap eder ken birden başlarınız. char hesaplarken 0 dan başlarsınız.
     //   //bir String ifadenin ilk karakteri ->charAt(0).indexdir
//
//
     //   //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz
//
//
     //   //System.out.println("name.charAt(99) = " + name.charAt(99));//rte
     //   // Trick->charAt()index boyutunu geçerse RTE verir.
//
//
     //   Scanner input=new Scanner(System.in);
     //   System.out.println("agam bişeyler giresen :");
     //   String  str=input.nextLine();
//
     //   if (str.length()%2==1){
     //       System.out.println("orta karakter : "+str.charAt(str.length()/2));
     //   }else System.out.println("girilen ifadenin orta karakteri yok..");

    }




    }


