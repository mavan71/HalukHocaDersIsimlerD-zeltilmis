package j31_Map;

import java.util.HashMap;
import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
/*
HashTable ->
HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
2-HashTable HashMap'e göre daha yavaştır
3-HashTable key ve value'lerda null değere izin vermez.
4-HashTable eleman ataması yapılırken  HashMap randum(rastgele: hurra )  yapar.
 */
        Hashtable<String, String> hm=new Hashtable<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","");
        System.out.println("hm remove öncesi= " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

       // System.out.println("hm.put(\"Samsung\",null) = " + hm.put("Samsung", null));//RTE
        System.out.println("hm.put(\"Apple\",\"33 Euro\") = " + hm.put("Apple", "33 Euro"));//hm.put("Apple","33 Euro") = 500 Euro
        //System.out.println("hm.put(null,\"AğayaBeleş\") = " + hm.put(null, "AğayaBeleş"));//RTE verir
        Hashtable<String, String> hm1=new Hashtable<>();//boş bir hashtable tanımlandı
        hm1.put("Murat", "çok Euro");
        hm1.put("Mustafa", "ençok Euro");
        hm1.put("Murtaza", "eneneçok Euro");
        System.out.println("hm1 = " + hm1);//hm1 = {Murat=çok Euro, Mustafa=ençok Euro, Murtaza=eneneçok Euro}
        hm.putAll(hm1);
        System.out.println("hm1 = " + hm);//hm1 = {Amazon=296 Euro, Apple=33 Euro, Teknosa=333 Euro, Media Market=, Murat=çok Euro, Mustafa=ençok Euro, Saturn=300 Euro, Vatan=111 Euro, Murtaza=eneneçok Euro}


    }
}
