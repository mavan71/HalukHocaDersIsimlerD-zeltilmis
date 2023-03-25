package j31_Map;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {

 /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etnez
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
        HashMap<String, String>hm=new HashMap<>();//boş bir hash map
        //map.put() girilen key ve değeri map eleman (entre) ekler
        hm.put("Amazon","296 Euro");
        hm.put(null,"200 Euro");//key null değeri alabilir
        hm.put(null,"220 Euro");//key null değeri alabilir
        hm.put("Ebay",null);//tekrarlı key grilen son value update edilir.
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Apple","550 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        //map print sout için map paremetre alır
        System.out.println("hm = " + hm);

    }
}
