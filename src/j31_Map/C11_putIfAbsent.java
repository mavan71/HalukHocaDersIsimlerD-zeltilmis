package j31_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        //map.putIfAbsent(); --> girilen Key map te yoksa entry (key,value) map' eklenirve null return eder
      //  parametre entry değil sadece key değer girilirse key map'de varsa siler ve silinen key value return eder yoksa null return eder

        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm remove öncesi= " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

        System.out.println("hm.putIfAbsent(\"Amazon\",\"selametle\") = " + hm.putIfAbsent("Amazon", "selametle"));//296 Euro
        System.out.println("hm.putIfAbsent(\"olmayanKey\",\"ağayaBeleş\") = " + hm.putIfAbsent("olmayanKey", "ağayaBeleş"));//null
        System.out.println("hm remove sonrası= " + hm);//hm remove sonrası= {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, olmayanKey=ağayaBeleş, Vatan=111 Euro}

    }
}
