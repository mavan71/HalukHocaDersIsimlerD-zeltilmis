package j31_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    //map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.
//map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
//map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.

    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm = " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}
        System.out.println("hm.size() = " + hm.size());//6
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//false
        hm.clear();
        System.out.println("hm = " + hm);//{}
        System.out.println("hm.size() = " + hm.size());//0
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//true


    }

}
