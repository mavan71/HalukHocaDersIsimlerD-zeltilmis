package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}

        System.out.println("***************1. yontem **********");
        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        };
        int yeniArr[]=new int [arr3.length];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                yeniArr[i]+=arr3[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
