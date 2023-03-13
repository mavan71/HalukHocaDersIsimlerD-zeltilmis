package J07_StringManipulation;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

          /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Üç kelimelik Cümle girin");
        String uclu=scan.nextLine().toUpperCase();
        char ch1=uclu.charAt(0);
        int space1=uclu.indexOf(" ");
        System.out.println(space1);
        char ch2=uclu.charAt(space1+1);
        int space2=uclu.lastIndexOf(" ");
        System.out.println(space2);
        char ch3=uclu.charAt(space2+1);
        String str2=ch1+"."+ch2+"."+ch3+".";
        System.out.println(str2);


    }



}
