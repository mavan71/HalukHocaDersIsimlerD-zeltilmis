package j12_Arrays.Tasks;

import java.util.Arrays;

public class _07_array_max_value1 {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int sayiArr[]={12,2,5,15,8};

        Arrays.sort(sayiArr);
        Arrays.toString(sayiArr);
        System.out.println(Arrays.toString(sayiArr));
        System.out.println("sayiArr'in en büyük elemanı " +sayiArr[sayiArr.length-1]);

    }
}