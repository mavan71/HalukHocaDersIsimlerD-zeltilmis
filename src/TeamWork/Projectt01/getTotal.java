package TeamWork.Projectt01;

import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


    /*
    verilen String variable'da sayı değerlerinin toplamını print eden code create ediniz


        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65;

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dolar işaretiyle miktarları giriniz");
        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // bu satırdan önceki kodlari değiştirmeyiniz
        // String num1,num2,num3 kullanın

        int sayi1=Integer.parseInt(num1.substring(1));
        int sayi2=Integer.parseInt(num2.substring(1));
        int sayi3=Integer.parseInt(num3.substring(1));
        int toplam=sayi1+sayi2+sayi3;
        if(toplam<0){
            System.out.println("-1");
        }else{
            System.out.println(toplam);
        }



    }


}

