package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {

    public static void main(String[] args) {
   /*  task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
    */
        List<Integer> l1 = new ArrayList<>(Arrays.asList(41, 52, 21, 35, 16, 17, 38, 19, 9));

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
