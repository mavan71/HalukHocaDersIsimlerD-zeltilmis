package j31_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        //map.putAll() girilen map istenen Map e eklenir.
        HashMap<String, String> hm=new HashMap<>();//boş bir hash map

        hm.put("Amazon","296 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","500 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Market","444 Euro");
        System.out.println("hm = " + hm);// bu map hm = {Apple=500 Euro, Saturn=300 Euro, Teknosa=333 Euro, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}
        HashMap<String, String> hm1=new HashMap<>();
        hm1.put("javaCAN","vedat");
        hm1.put("javaNAZ","ceren");
        hm1.put("javaTAR","sümeyye");
        hm1.put("javvaNUR","rukiyye");
        hm1.put("javaSU","haluk");
        System.out.println("hm1 = " + hm1);//hm1 = {javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN=vedat, javaSU=haluk}
        hm.putAll(hm1);
        System.out.println("hm = " + hm);//hm = {javvaNUR=rukiyye, Apple=500 Euro, javaNAZ=ceren, Saturn=300 Euro, Teknosa=333 Euro, javaTAR=sümeyye, javaCAN=vedat, javaSU=haluk, Amazon=296 Euro, Media Market=444 Euro, Vatan=111 Euro}

        System.out.println("hm1 = " + hm1);//hm1 = {javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN=vedat, javaSU=haluk}

        HashMap<String, String>hm3=hm1;//hm1 hm3 e atandaı
        HashMap<String, String>hm4=new HashMap<>(hm3);//hm3 hm4 için cons parametresi yapıldı
        System.out.println("hm3 = " + hm3);//hm3 = {javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN=vedat, javaSU=haluk}
        System.out.println("hm4 = " + hm4);//hm4 = {javaCAN=vedat, javvaNUR=rukiyye, javaNAZ=ceren, javaSU=haluk, javaTAR=sümeyye}
    }
}
