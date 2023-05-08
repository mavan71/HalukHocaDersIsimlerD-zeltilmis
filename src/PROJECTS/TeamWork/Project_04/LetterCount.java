package PROJECTS.TeamWork.Project_04;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LetterCount {


    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */


    /*

            Verilen bir String
            String'den her bir char alın, her bir char'ın sayısını döndür

            Örnek:

            String = aabbbcccc

            return     a , 2     olmalı
                       b , 3
                       c , 4

            Not: Stringde herhangi bir char olabilir.

     */



    public static LinkedHashMap<Character, Integer> charCount(String myStr){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < myStr.length(); i++) {
            if (!result.containsKey(myStr.charAt(i))) {
                result.put(myStr.charAt(i), 1);
            }else{
                int count = (int) result.get(myStr.charAt(i));
                result.put(myStr.charAt(i), count + 1);
            }

        }


        return  result;
    }


}

