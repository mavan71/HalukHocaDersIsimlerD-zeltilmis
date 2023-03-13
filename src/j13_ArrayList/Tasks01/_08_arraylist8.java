package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(5,3,4,6,7,67,34,65));

        secondMax(list);
        System.out.println(secondMax(list));

    }//Main sonu

    private static int secondMax(ArrayList<Integer> list) {

        Collections.sort(list);

        int ikinciMaxElaman=list.get(list.size()-2);;


        return ikinciMaxElaman;
    }


}//Class sonu
