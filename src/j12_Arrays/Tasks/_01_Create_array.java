package j12_Arrays.Tasks;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String args []) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String meyveArr[]={"Apple","Orange","Banana","Kiwi"};
        System.out.println(Arrays.toString(meyveArr));
        String ingMeyveArr[]={"Apple","Orange","Banan","Kiwi"};
        String yeniString =Arrays.toString(ingMeyveArr);
        System.out.println(yeniString);
        System.out.println(Arrays.toString(ingMeyveArr));

    }
}
