package Deneme111;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer>list=new ArrayList<>(List.of(11,22,33,44,55,66,77,88,99));
        Scanner input =new Scanner(System.in);
        System.out.println("Hangi sayıyı soruyorsunuz");
        int sayi=input.nextInt();

            boolean sayiListedeVarmi=false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(sayi)) {
                sayiListedeVarmi=true;
                break;

            }
        }
        System.out.println("sayiListedeVarmi = " + sayiListedeVarmi);
    }

}
