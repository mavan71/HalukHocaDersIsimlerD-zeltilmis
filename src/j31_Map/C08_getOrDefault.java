package j31_Map;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {

        //map.getOrDefault();--> girilen key map de varsa key e ait value yoksa default değerini getriri

        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm = " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

        System.out.println("hm.getOrDefault(\"Apple\",\"javaAYDIN\") = " + hm.getOrDefault("Apple", "javaAYDIN"));//500 Euro
        System.out.println("hm.getOrDefault(\"olmayanKey\",\"javaASLAN\") = " + hm.getOrDefault("olmayanKey", "javaASLAN"));//javaASLAN
        //olmayan Key map te olmadığı için default değeri return edildi.
        System.out.println("hm.getOrDefault(\"vatan\",\"111Euro\") = " + hm.getOrDefault("vatan", "111Euro"));//111Euro
        System.out.println("hm = " + hm);//hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

    }
}
