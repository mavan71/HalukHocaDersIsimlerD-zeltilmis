package j12_Arrays.Tasks1;

import java.util.Arrays;

public class  Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        int Arr[]={1,78,23,56,24,39};
        Arrays.sort(Arr);
        System.out.println(Arrays.toString(Arr));

        for (int i = Arr.length-1; i >=0 ; i--) {
            System.out.print(Arr[i]+" ");

        }

    }
}
