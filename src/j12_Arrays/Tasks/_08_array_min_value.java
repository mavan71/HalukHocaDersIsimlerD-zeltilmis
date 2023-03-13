package j12_Arrays.Tasks;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int sayiArr[]={14 , 19 , 5 , 21};

        Arrays.sort(sayiArr);
       // Arrays.toString(sayiArr);
        System.out.println(Arrays.toString(sayiArr));
        System.out.println("sayiArr'in en küçük elemanı " +sayiArr[0]);
    }
}

