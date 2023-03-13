package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        rakamToplamı();

    }
    private static void rakamToplamı() {
        String strArr[]={"ade1r4d3","Anta2lya2023","expo1453", "maslak1071","cevizlibağ1881","he1def2071"};
        int numArr[]=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i]=strArr[i].replaceAll("\\D", "");

        }
        System.out.println(Arrays.toString(strArr));


        int toplam=0;
        for (int i = 0; i <strArr.length; i++) {
            toplam+=Integer.parseInt(strArr[i]);
        }

        System.out.println("toplam = " + toplam);
}
}









