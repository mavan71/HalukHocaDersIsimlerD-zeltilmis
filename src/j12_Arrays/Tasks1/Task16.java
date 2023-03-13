package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        System.out.println("***************1. yontem **********");
        int sayiArr [] ={12,16,14,15,18};
        int carpim=1;
        for (int i = sayiArr.length-2; i < sayiArr.length; i++) {
            carpim*=sayiArr[i];


        }
        System.out.println(Arrays.toString(sayiArr));
        System.out.println("Array ın elemanlarının carpımı = " +carpim);
        System.out.println("***************2. yontem **********");
        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        }; // son elemanlarının çarpımını create ediniz.


        int carpım=1;
        for (int i = 0; i < arr3.length; i++) {
            carpım*=arr3[i][arr3[i].length-1];
        }
        System.out.println(carpım);
    }
}
