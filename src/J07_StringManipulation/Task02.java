package J07_StringManipulation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

          /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 	 		 */

        Scanner input = new Scanner(System.in);
        System.out.print("Parolanız;\n a)Ilk karakteri buyuk harf olmalı\n " +
                "b)Son karakteri sayi olamlı\n c)En az 6 karakter uzunlugunda olmalı\n" +
                "\n Lütfen parolanızı giriniz : ");

        String parola = input.nextLine();
        char ilkHarf=parola.charAt(0);
        char sonHarf=parola.charAt(parola.length()-1);



       // Boolean a = Character.isUpperCase(ilkHarf);
     //   Boolean b = Character.isDigit(sonHarf);
      //  Boolean c= parola.length()>=6;

       // if(a==true && b==true && c==true){
            System.out.println("Tebrikler! Giriş başarılı.");
        //***********
     //   Scanner scan =new Scanner(System.in);
     //   System.out.print("Lütfen bir passwordu girin :");
//
     //   String cumle = scan.nextLine();
     //   System.out.println("cumle.contains(\" \") = " + cumle.contains(" "));



    }
}

