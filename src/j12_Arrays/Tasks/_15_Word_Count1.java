package j12_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count1 {

    public static void main(String[] args) {

        /*String str="Removes white space from both ends of a string
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str="Removes white space from both ends of a string";
        String strArr[]=str.split(" ");//buString dizisini boşluklara göre bölüp str dizisi yapıldı
        System.out.println(Arrays.toString(strArr));//str yazdırıldı [Removes, white, space, from, both, ends, of, a, string]
        System.out.println(strArr.length);//9
    }
}