package Deneme111;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

 /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Bir sayi Giriniz");
            int sayi=input.nextInt();
            list.add(sayi);
        }
        System.out.println("list = " + list);
        tekSayilar(list);
        System.out.println("tekSayilar(list) = " + tekSayilar(list));

    }

    private static ArrayList tekSayilar(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
            continue;
        }else
            result.add(list.get(i));

        }

        return result;
    }
}
