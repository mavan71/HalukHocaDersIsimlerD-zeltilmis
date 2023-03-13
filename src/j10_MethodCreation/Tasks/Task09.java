package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        saatiSaniyeyeÇevir();
    }
    private static void saatiSaniyeyeÇevir() {
        System.out.println("Saniyeye çevrilmesini istediğiniz Saati giriniz");
        double saat= input.nextDouble();
        System.out.println("Girilen " + saat + " saat "+(saat*60*60)+" Saniyedir");
    }
}
