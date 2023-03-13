package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class C04_TernaryClass {
    public static void main(String[] args) {
        //girilen bir sayının 2 veya daha fazla basamaklı olmasını kontrol
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi = scan.nextInt();

        System.out.println(( sayi<10 && sayi >-10)? "Sayı Tek Basamaklı" : "Sayı Çift Basamaklı ");
    }




}


