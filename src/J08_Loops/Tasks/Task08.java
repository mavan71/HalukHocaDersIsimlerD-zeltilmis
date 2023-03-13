package J08_Loops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

/*
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int boyut=input.nextInt();
        for (int crpn1 = 1; crpn1<=boyut; crpn1++) {//kat tekrar
            for (int crpn2 = 1; crpn2<=boyut;crpn2++) {//daire tekrar
                System.out.print(" "+(crpn1*crpn2));//1*1=1 1*2 =2
            }
            System.out.println();//dumy code hayalet code alta geçmesi için
        }

    }
}
