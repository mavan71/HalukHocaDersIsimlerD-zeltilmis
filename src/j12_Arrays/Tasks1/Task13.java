package j12_Arrays.Tasks1;

import java.util.Arrays;
import java.util.Scanner;

import static java.sql.DriverManager.println;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

        int sayiArr [] ={12,16,14,15,18,19,33,45};
        System.out.println("Arrays.binarySearch(12) = " + Arrays.binarySearch(sayiArr,19));
        int sayac=0;


        for (int i = 0; i < sayiArr.length; i++) {
            if(sayiArr[i]%3==0){
                sayac++;
            }

        }
        System.out.println("Girilen 8 elemanli arrayin icinde\n" +
                "        3 e bolunebilen "+sayac+ " sayi vardır ");


    }

}
