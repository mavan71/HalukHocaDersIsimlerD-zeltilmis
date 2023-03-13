package j12_Arrays.Tasks1;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        System.out.println("Array kaç elemanlı olsun");
        int elemanSayisi=input.nextInt();
        int Arr[]=new int[elemanSayisi];

        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println(i+". elemanı giriniz" );
            Arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(Arr));


        for (int i =0; i <Arr.length ; i++) {

            if (Arr[i]%2==1){
                System.out.print(Arr[i]+" ");

            }

        }
    }
}
