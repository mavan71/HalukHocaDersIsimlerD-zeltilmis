package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

       // System.out.println("agam ahan da yeni arrayin : " + Arrays.toString(yeniArr));




        Scanner input=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

      String str=input.nextLine();
      String str1="";
      for (int i = str.length()-1; i >=0 ; i--) {
          str1+=str.charAt(i);

      }
      int sayi=Integer.parseInt(str1);
      sayi=sayi+1;
      System.out.println(str1);
      System.out.println(sayi);





    }
}



