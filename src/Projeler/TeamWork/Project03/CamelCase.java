package Projeler.TeamWork.Project03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;



public class CamelCase {
   static Scanner scan = new Scanner(System.in);



     /*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
    public static void main(String[] args) {


        System.out.println(camelcase());

    }

    public static String camelcase() {
        System.out.println("Lütfen bir cümle yazınız");
        String str = scan.nextLine();
        System.out.println("str = " + str);
        ArrayList<String>list=new ArrayList<String>();
        list.add(Arrays.toString(str.split(" ")));


               for (int i = 0; i < list.size(); i++) {
            list.get(i).substring(0,1).toUpperCase().concat(list.get(i).substring(1));
        }

        return str;
    }
}

