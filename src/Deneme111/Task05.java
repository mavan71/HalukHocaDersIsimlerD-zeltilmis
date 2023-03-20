package Deneme111;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String isimArr[][] = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

       ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                list.add(isimArr [i][j]);
            }
        }

        System.out.println("list : "+list);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
