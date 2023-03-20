package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    static int [] arr= {3,5, 1, 2, 7, 9, 2, 3, 5, 7};
    static int [] yeniArr=new int [4];
    public static void main(String[] args) {

           ardisikToplam(arr);
    }//main sonu

    private static void ardisikToplam(int[] arr) {
        int sayac=0;
        int indexBul=1;

        do {
            int toplam=0;
            for (int i=0; i<=sayac; i++) {
                toplam+=arr[indexBul-1+i];
            }
            yeniArr[sayac]=toplam;
            sayac++;
            indexBul+=sayac;


        }while (sayac<yeniArr.length);

        System.out.println("Yeni Array = " + Arrays.toString(yeniArr));
    }
}//Class sonu

