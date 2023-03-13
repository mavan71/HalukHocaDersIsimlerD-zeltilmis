package J07_StringManipulation;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */
        Scanner scan =new Scanner(System.in);
        System.out.println("Ad Soyad girin");
        String isim=scan.nextLine().toUpperCase();
        int space=isim.lastIndexOf(" ");
        System.out.println("isim = " + isim.substring(0, space));
        //System.out.println("Soyisim = " + isim.substring(space).trim());
        System.out.println("Soyisim = " + isim.substring(space, isim.length()));

    }
}
