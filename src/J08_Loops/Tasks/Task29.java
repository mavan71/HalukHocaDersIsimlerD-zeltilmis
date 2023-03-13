package J08_Loops.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Java  output: JaVa
        Scanner input = new Scanner(System.in);
        System.out.print("Bir ifade giriniz:");
        String str = input.nextLine();
        String bos = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                String str2 = String.valueOf(str.charAt(i)).toUpperCase();
                bos += str2;
            } else {
                String str1 = String.valueOf(str.charAt(i)).toLowerCase();
                bos += str1;
            }
        }
        System.out.println("Girilen ifade değiştirildi: "+bos);

    }
}
