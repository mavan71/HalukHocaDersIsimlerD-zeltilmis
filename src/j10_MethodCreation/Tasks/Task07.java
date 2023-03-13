package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    public static <ınt> void main(String[] args) {
        //Task girilen 3 sayıdan en küçüğünü print eden Method create ediniz
        enKucukBul();
        int okulUcuncusu =enKucukBul1();
        System.out.println("okulUcuncusu :"+okulUcuncusu);
    }//main sonu

    private static int enKucukBul1() {
        System.out.print("1. sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        int sayi3 = input.nextInt();

       return sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3) ? (sayi2) : (sayi3);

    }

    private static void enKucukBul() {
        System.out.print("1. sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        int sayi3 = input.nextInt();

        System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? (sayi2) : (sayi3)));

    }

}//main sonu
