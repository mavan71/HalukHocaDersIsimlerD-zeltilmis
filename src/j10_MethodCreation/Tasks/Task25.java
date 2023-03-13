package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz

    faktoriyel();
    }
    public static void faktoriyel() {
        System.out.println("Bir Sayı Giriniz");
        int sayi=input.nextInt();
        int faktoriyel=1;
        for (int i = 1; i <=sayi; i++) {
            faktoriyel*=i;


        }
        System.out.print(faktoriyel);
    }
}
