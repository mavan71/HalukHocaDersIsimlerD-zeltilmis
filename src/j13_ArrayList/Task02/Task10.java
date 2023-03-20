package j13_ArrayList.Task02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
            ArrayList<Integer>list=new ArrayList<Integer>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        System.out.println("tekrarsizList(list) = " + tekrarsizList(list));

    }//main sonu

    private static ArrayList tekrarsizList(ArrayList<Integer> list) {

        ArrayList<Integer> tekrarsizList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(!tekrarsizList.contains(list.get(i))) {
            tekrarsizList.add(list.get(i));
            }
        }


        return tekrarsizList;
    }

}
