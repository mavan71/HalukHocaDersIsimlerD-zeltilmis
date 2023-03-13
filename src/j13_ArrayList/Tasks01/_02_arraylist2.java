package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,122));

        System.out.println("getSum(list2) = " + getSum(list2));

    }

    private static int getSum(ArrayList<Integer> list2) {

    int Sum=0;
        for (int i = 0; i < list2.size(); i++) {
            Sum+=list2.get(i);
        }
    return Sum;
    }


}
