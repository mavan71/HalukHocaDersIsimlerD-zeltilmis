package J08_Loops.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini ğrint eden code create ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("Ağam bir tamsayı gir");
        int sayi=input.nextInt();
        int rakamlarToplam=0;//işleme etki etmeyecek boş kutu atandı
        for(int i=sayi; i>0; i=i/10){//sayıdan başlayıp her tekrarda basamak sayısı bir azalan loop tanımladık
            rakamlarToplam+=i%10;
        }
        System.out.println("rakamlarToplam="+rakamlarToplam);




    }
}
