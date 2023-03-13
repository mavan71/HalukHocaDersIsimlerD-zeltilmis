package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String isimArr[][] = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        ArrayList<String> isimList=new ArrayList<String>();
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                isimList.add(isimArr[i][j]);
            }
        }
        System.out.println("isimList = " + isimList);
        Collections.sort(isimList);
        System.out.println("isimList = " + isimList);
    }

}
