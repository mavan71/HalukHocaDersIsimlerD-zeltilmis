package PROJECTS.TeamWork.Project_04;

import java.util.*;

public class sortHashSet {

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */


    /*
        Verilen  allNumbers Integer Hashset

         allNumbers hashset'i sort et

        Sonucu ArrayList olarak değiştir

        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TYPES KULLANIN


     */
    public static ArrayList<Integer> sort(HashSet<Integer> allNumbers){

        ArrayList<Integer> sort = new ArrayList<>(allNumbers);


        sort.sort(null);

        return  sort;
    }

}
