package Deneme111;

import java.util.ArrayList;
import java.util.List;

public class Task04 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String>list=new ArrayList<>(List.of("Murat","Osman","ismail","Yusuf","irem","Zeynep"));
        ArrayList<String>aOlmayanlist=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
         if(!(list.get(i).contains("a")||list.get(i).contains("A")) )  {
             aOlmayanlist.add(list.get(i));
         }


        }
        System.out.println("aOlmayanlist = " + aOlmayanlist);
        list.clear();
        System.out.println("list = " + list);
        list.addAll(aOlmayanlist);
        System.out.println("list = " + list);

    }
}
