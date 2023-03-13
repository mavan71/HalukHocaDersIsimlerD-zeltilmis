package j12_Arrays.Tasks1;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz


        int Arr[]=new int[5];

        for (int i = 0; i <5 ; i++) {
            System.out.println(i+". elemanı giriniz" );
            Arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(Arr));
        for (int i =Arr.length-1; i >=0 ; i--) {
            System.out.print(Arr[i]+" ");

        }
    }
}
