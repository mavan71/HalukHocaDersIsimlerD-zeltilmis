package j30_Collections.C03_Queue;

import java.util.*;

public class C01_Queue {
    public static void main(String[] args) {

        /*
Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Cons seçimine göre queue obj özelliklieri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

 */
        Queue<String>q1=new LinkedList<>(Arrays.asList("JavaCAN","javaSU","javaNUR","javaNAZ"));

        System.out.println("q1 = " + q1);
        q1.add(("javaTAR"));
        System.out.println("q1 = " + q1);//q1 = [JavaCAN, javaSU, javaNUR, javaNAZ, javaTAR]
        Queue<String>q2=new  PriorityQueue <>(Arrays.asList("Biftek","Meyve Tabağı","Lüfer"));
        System.out.println("q2 = " + q2);
        q2.add("Gerdan");
        System.out.println("q2 = " + q2);//q2 = [Biftek, Gerdan, Lüfer, Meyve Tabağı]
        q1.clear();
       // System.out.println("q1.element() = " + q1.element());//boş ise hata verir
        System.out.println("q1.peek() = " + q1.peek());//boş ise hata vermez ama null değeri verir
/*
   peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
   poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
   element() -> ilk elemanı silmeden return eder.
   remove() -> ilk elemnı siler ve return eder.. :kaldırma

  ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
  poll ise null return eder.
 */
q1.clear();
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.isEmpty() = " + q1.isEmpty());//q1.isEmpty() = true
        System.out.println("q1.poll() = " + q1.poll());////q1.poll() = null
        //System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1.peek() = " + q1.peek());//q1.peek() = null

        q1.offer("javaFER");
        System.out.println("q1 = " + q1);

    }
}
