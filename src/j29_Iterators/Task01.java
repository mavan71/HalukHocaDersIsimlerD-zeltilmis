package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {

    public static void main(String[] args) {
/*
task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
 */
        List<Integer> l1 = new ArrayList<>(Arrays.asList(11, 12, 11, 15, 16, 17, 18, 19, 9));

        ListIterator<Integer> it1 = l1.listIterator();//step ->1
        while (it1.hasNext()) {//step->1.5 :baştan->sona  doğru sürekli pointer sona doğru ilerletilir
            it1.next();
        }
        while (it1.hasPrevious()) {//step->2 ana action için pointer sondan->başa ilerler
            System.out.print(Math.pow(it1.previous(), 2)+" " );
        }
        System.out.println();


    }

}
