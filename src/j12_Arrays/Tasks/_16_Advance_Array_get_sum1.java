package j12_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum1 {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
        String str="$12 $23 $10 $2 $5 $2";
        System.out.println(str);
        String str1=str.replace("$", "");
        String strArr[]=str1.split(" ");
        System.out.println(Arrays.toString(strArr));


        int sum = 0;
        for (int i = 0; i < strArr.length ; i++) {
            sum+= Integer.parseInt(strArr[i]);
        }
        System.out.println("Sum : " +"$"+ sum);






    }
}