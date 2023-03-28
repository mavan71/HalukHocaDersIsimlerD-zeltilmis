package j31_Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
TreeMap->
1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
3-TreeMap synchronized ve thread-safe değildir
4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
 */
        TreeMap<Integer, String>tm=new TreeMap<>();//boş bir treeMap tanımlandı
        tm.put(101,"Harika");
        tm.put(102,"Eda");
        tm.put(103,"Rukiyye");
        tm.put(102,"Tuğba");
        tm.put(104,"Sümeyye");
        System.out.println("tm = " + tm);//tm = {101=Harika, 102=Tuğba, 103=Rukiyye, 104=Sümeyye}
        tm.put(105,null);
        //tm.put(null,"haluk");
        System.out.println("tm = " + tm);//tm = {101=Harika, 102=Tuğba, 103=Rukiyye, 104=Sümeyye, 105=null}

        Hashtable<String, String> hm=new Hashtable<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","");
        System.out.println("hm " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

        TreeMap<String,String>tm1=new TreeMap<>(hm);//hashmap treemap parametre atanarak convert edildi ...
        System.out.println("tm1 = " + tm1);//tm1 = {Amazon=296 Euro, Apple=500 Euro, Media Market=, Saturn=300 Euro, Teknosa=333 Euro, Vatan=111 Euro}//natural order
        //TreeMap<String,String>tm2=hm;//CTE datatype MissMatch
        //map ceiling Key ();--> Girilemn key map de varsa return eder
        //girilen key map te yoksaparametre girilen keyden buyuk en kuçuk key return edilir.
        //girilen key map de yoksa ve parametre key den buyuk en kuçuk key return edilir
        //ceilingKey():-->enküçük abla abi verir
        System.out.println("tm.ceilingKey(99) = " + tm.ceilingKey(99));  //101// 99 key map de yok ama 99 un enküçük ağbisi 1001 i return etti
        System.out.println("tm.ceilingKey(111) = " + tm.ceilingKey(111));//null-->11 key map'de yok ama 111 in enküçük abisi 112 113...  hiçbiri yok null
        System.out.println("tm.ceilingKey(102) = " + tm.ceilingKey(102));//102-->102 key map de var ve return edildi.
        System.out.println("tm.ceilingKey(102) = " + tm.ceilingKey(1));//10-->1 key map de yok bende olan en küçük abi 101 return edildi.

        //assending order--> artan sıralama
        //descending order--> azalan sıralama
        System.out.println("tm = " + tm);//tm = {101=Harika, 102=Tuğba, 103=Rukiyye, 104=Sümeyye, 105=null}
        System.out.println("tm.descendingKeySet() sonrası= " + tm.descendingKeySet());//tm.descendingKeySet() = [105, 104, 103, 102, 101]
        System.out.println("tm = " + tm);//tm = {101=Harika, 102=Tuğba, 103=Rukiyye, 104=Sümeyye, 105=null}
        System.out.println("tm.keySet() = " + tm.keySet());//tm.keySet() = [101, 102, 103, 104, 105]
        System.out.println("tm.firstKey() = " + tm.firstKey());//tm.firstKey() = 101
        System.out.println("tm.lastKey() = " + tm.lastKey());//tm.lastKey() = 105

    }
}
