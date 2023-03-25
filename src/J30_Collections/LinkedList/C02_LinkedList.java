package j30_Collections.LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll=new LinkedList<>();//Data Type Object (Hz adem) ne olusan ol gel
        LinkedList<Object> l2=new LinkedList<>();//Data Type Object (Hz adem) ne olusan ol gel generic class
        //BAD practice --> app çok yavaşlatır.
        ll.add(1905);
        ll.add("javaCAN");
        ll.add('$');
        System.out.println("ll = " + ll);//ll = [1905, javaCAN, $]//karşık kullanmak çok yavaşlatır


    }
}
