package j31_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {


        //map.remove (); meth -->girilen  entry (entry hem key hem value) map de varsa siler ve true return eder yoksa false return eder.
        //parametre entry değil sadece key değer girilirse
        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm remove öncesi= " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

        System.out.println("hm.remove(\"Apple\",\"500 Euro\") = " + hm.remove("Apple", "500 Euro"));//true
        System.out.println("hm.remove(\"Vatan\",\"ebikGabık\") = " + hm.remove("Vatan", "ebikGabık"));//false
        System.out.println("hm.remove(\"mediaMarket\") = " + hm.remove("Media Market"));//444Euro
        System.out.println("hm.remove(\"olmayan Key\") = " + hm.remove("olmayan Key"));//null

        System.out.println("hm = " + hm);//hm = {Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}
