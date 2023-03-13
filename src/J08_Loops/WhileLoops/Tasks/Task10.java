package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayıyı kadar tek sayıları istiyorsunuz: ");
        int sayi= input.nextInt();
        int i=1;
        System.out.println("Tek sayılar:  ");
        while (sayi>=i){
            System.out.print(i+" ");
            i+=2;
        }
    }
}
