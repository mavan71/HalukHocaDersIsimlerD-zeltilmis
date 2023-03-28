package j31_Map;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {
        //map replace meth. şunu yapar. girilen value değeri ilgili Key'de update edilip oldValue(update öncesi değeri)return eder.

        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm = " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

    hm.replace("Amazon","99 Euro");
        System.out.println("hm replace sonrası = " + hm);//hm replace sonrası = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=99 Euro, Media Market=444 Euro, Vatan=111 Euro}
        System.out.println("hm.replace(\"olmayan Key\",\"javvaNUR\") = " + hm.replace("olmayan Key", "javvaNUR"));//null
//map de olmayan Key için null return eder.
    }
}
