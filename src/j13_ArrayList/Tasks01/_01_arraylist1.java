package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String>list1=new ArrayList<>(Arrays.asList("Orange","Kiwi" , "Peach" , "Banana" , "Orange","Orange" ));
        ArrayList<String>list2=new ArrayList<>(List.of("orange","Kiwi" , "Peach" , "Banana" , "Orange" ));
        System.out.println("getCount(list1, \"Orange\") = " + getCount(list1, "Orange"));
    }

    private static int getCount(ArrayList<String> list1, String str) {

        int sayac=0;
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).contains(str)){
                sayac++;
            }
        }
        return sayac;
    }
}