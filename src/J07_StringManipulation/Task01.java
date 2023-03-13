package J07_StringManipulation;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan =new Scanner(System.in);
        System.out.print("adıniz");
        String cumle = scan.next();
        System.out.println(cumle.contains(" "));




    }
}
