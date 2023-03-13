package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        int arr[]=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        int yeniArr[]=new int [3];

        for (int i = 0; i < arr.length-1; i++) {
            yeniArr[i]=arr[i+1];

        }yeniArr[2]=arr[0];
        System.out.println(Arrays.toString(yeniArr));


    }

}
