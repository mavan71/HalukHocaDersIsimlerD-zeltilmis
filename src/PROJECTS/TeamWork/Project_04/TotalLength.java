package PROJECTS.TeamWork.Project_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TotalLength {

    /*

       Parameter is one Set String

       Get the total length of each String in the Set
       return the total

       Example:
       Set String is "repl" "is" "homework"

       result should be 14

       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1

     */


    /*

       Parametre  Set String

       Set içindeki  her bir Stringin toplam uzunluğunu al

       return total

       Örnek:

       Set String "repl" "is" "homework"

       result  14 olmalı

       NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİR

     */
    public static int getTotalLength(HashSet<String> mySet){
        int totalLength =0;
        for (String s:mySet) {
            totalLength+=s.length();
        }

        if(totalLength ==0){
            totalLength=-1;
        }


        return totalLength;

    }

}
