package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>(List.of(1,2,3,4));
        dupicate(list);
        System.out.println("dupicate(list) = " + dupicate(list));


    }

    private static boolean dupicate(ArrayList<Integer> list) {
        boolean tekrar=false;
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
        if(list.get(i-1)==list.get(i)){
            tekrar=true;
        }


        }



        return tekrar;
    }

}