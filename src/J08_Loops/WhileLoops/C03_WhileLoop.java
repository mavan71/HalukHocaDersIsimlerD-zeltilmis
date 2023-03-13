package J08_Loops.WhileLoops;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner sc = new Scanner(System.in);
        System.out.print("gakgom bisayi girisin : ");
        int biSayı = sc.nextInt();
        int tamBolenSayi = 1;
        int tamBolenAdeti = 0;


        while (tamBolenSayi <= biSayı) {

            if (biSayı % tamBolenSayi == 0) {
                tamBolenAdeti++;
            }
            tamBolenSayi++;

        }
        System.out.println("girilen tamsayı :"+biSayı+" nın "+tamBolenAdeti+" kadar böleni var ..");

    }
}
