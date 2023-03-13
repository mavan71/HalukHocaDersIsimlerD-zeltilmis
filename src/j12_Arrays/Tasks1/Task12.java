package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        System.out.println("1. Yöntem");
        Integer Arr[]={2,6,4,5,8,9};

        for (int i = 0; i < Arr.length; i++) {
            System.out.print((Arr[i]*Arr[i])+" ");

        }

        System.out.println("2. Yöntem");

        int sayiArr [] ={2,6,4,5,8,9};
        int karelerArr[]=new int[sayiArr.length];
        for (int i = 0; i <sayiArr.length ; i++) {
            karelerArr[i]=sayiArr[i]*sayiArr[i];
        }

        System.out.println("Arrays.toString(karelerArr) = " + Arrays.toString(karelerArr));


    }

}
