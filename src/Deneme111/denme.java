package Deneme111;

import java.util.Arrays;

public class denme {
    public static void main(String[] args) {


        String str[]=new String[3];
        str[1] = "toyota";
        str[2] = "audi";
        str[0] = " ";

        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(str));//Arrays.toString(Arr) = [12, 25, 24, 34, 56]
        Arrays.sort(str);
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(str));//Arrays.toString(Arr) = [12, 24, 25, 34, 56]
        System.out.println(str);//[I@26ba2a48
        int Arr[] = new int[5];
        Arr[1] = 25;


        Arr[4] = 56;
        Arr[0] = 12;
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 25, 24, 34, 56]
        Arrays.sort(Arr);
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 24, 25, 34, 56]
        System.out.println(Arr);//[I@26ba2a48
        System.out.println(Arr + " ");//[I@26ba2a48
    }
}
