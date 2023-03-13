package J07_StringManipulation;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir Cümle girin");
        String cumle=scan.nextLine();
        //System.out.println(cümle.replace(" ","a"));//.length());//Boşlukları (" ") yerine "" koyduk boşluk kalmadı.
        System.out.println(cumle.length());
        System.out.println(cumle.replaceAll("\\s", "").length());

    }


}
