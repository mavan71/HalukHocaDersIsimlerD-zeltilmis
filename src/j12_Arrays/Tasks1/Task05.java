package j12_Arrays.Tasks1;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        System.out.println("Array kaç elemanlı olsun");
        int elemanSayisi=input.nextInt();
        int Arr[]=new int[elemanSayisi];

        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println(i+". elemanı giriniz" );
            Arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(Arr));
         int yeniArr[]=new int [elemanSayisi];

        for (int i =Arr.length-1; i >=0 ; i--) {
            System.out.print(Arr[i]+" ");

        }

    }

}
