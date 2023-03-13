package j12_Arrays.Tasks;

import java.util.Arrays;

public class _09_array_second_max1 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int sayiArr[]={15 , 25, 22, 18, 30};
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));
        //Arrays.toString(sayiArr);
        System.out.println("Arraydaki en büyük 2. elemanı "+sayiArr[sayiArr.length-2]);


    }
}
