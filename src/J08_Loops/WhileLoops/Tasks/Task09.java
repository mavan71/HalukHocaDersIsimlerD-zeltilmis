package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayıyı toplamak istiyorsunuz: ");
        int adet= input.nextInt();
        int i=1;
        int toplam=0;
        int sayi;
        while (adet>=i){
            System.out.print(i+".sayıyı giriniz: ");
            sayi= input.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("toplam = " + toplam);

    }

}
