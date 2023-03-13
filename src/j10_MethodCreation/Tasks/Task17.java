package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        sayıyıTersindenYazma();

    }

    private static void sayıyıTersindenYazma() {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Tamsayı Giriniz");

        String sayi=input.nextLine();
        for (int i = sayi.length()-1; i >=0 ; i--) {
            char harf=sayi.charAt(i);
            System.out.print(harf);

        }
    }

}

