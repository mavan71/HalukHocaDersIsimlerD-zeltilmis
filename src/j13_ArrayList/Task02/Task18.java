package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        ArrayList<String>isimler=new ArrayList<>(List.of("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("isimler = " + isimler);
        System.out.println("Hangi elemanların yeri değişsin?");

        int sayi1=input.nextInt();
        int sayi2=input.nextInt();


        String s1=isimler.get(sayi1);


        isimler.set(sayi1,isimler.get(sayi2));
        isimler.set(sayi2,s1);



        System.out.println("isimler = " + isimler);


    }
}
