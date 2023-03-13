package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

    ArrayList<String>list3=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        getLength(list3);


    }

    private static void getLength(ArrayList<String> list3) {
        ArrayList<Integer> uzunluk = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
           uzunluk.add(list3.get(i).length());
        }
        //return uzunluk;
    }

}