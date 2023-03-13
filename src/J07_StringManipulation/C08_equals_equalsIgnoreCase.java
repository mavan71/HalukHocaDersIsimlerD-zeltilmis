package J07_StringManipulation;

public class C08_equals_equalsIgnoreCase {

        public static void main(String[] args) {
            //Hocanın Yazdıklarım

            /* equals()
             * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
             *
             *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
             * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
             * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

             * equalsIgnorecase()
             * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
             */

            String str1 = "murat";
            String str2 = "Murat";


            System.out.println("str1.equals(str2) = " + str1.equals(str2));//false
            System.out.println("str2.equals(str1) = " + str2.equals(str1));//false
            System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));//true
            str2 = "murat";
            System.out.println("str1.equals(str2) = " + str1.equals(str2));// true

                /*
                equlas() ile == farkı...
                 */
            String s1 = "clarusway";//->Stribg pool variable-> gölek cebinde çıkan para
            String s2 = "clarusway";//->Stribg pool variable-> gölek cebinde çıkan para
            String s3 = new String("clarusway");//->String data type obj. non-primitive->heapmemory ->cüzdan
            String s4 = new String("clarusway");
            ;//->String data type obj. non-primitive->heapmemory ->cüzdan
            System.out.println(s1 == s2);//True-> s1 ve s2 aynı String pool(ref değeri aynı) value de aynı
            System.out.println("s1.equals(s2) = " + s1.equals(s2));//true ->equals sadece value baktıgı için
            System.out.println("s3==s4 = " + s3 == s4);//false-> s3 ve s4 aynı değere sahip ama farklı obj oldg ref. değ farklı
            System.out.println("s3.equals(s4) = " + s3.equals(s4));//true ->equals sadece value baktıgı için

            String sA="Kadir";
            String sB="";
            sB=sA+"";

            System.out.println("sA = " + sA);//Kadir
            System.out.println("sB = " + sB);//Kadir

            System.out.println(sA == sB);//False
            System.out.println(sA.equals(sB));//True
            // equals() methodu sadece String'lerin degerlerini karsilastirir
            // bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur

 /*
 String s1 = “text”; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
 Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java’ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

 s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
 s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
 s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
 Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
 için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
 s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
         */
            //Kendi Yazdıklarım
            /* equals()
             * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
             *
             *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
             * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
             * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

             * equalsIgnorecase()
             * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
             */

            String str5 = "murat";
            String str6 = "Murat";


            System.out.println("str5.equals(str6) = " + str5.equals(str6));//false
            System.out.println("str6.equals(str5) = " + str6.equals(str5));//false
            System.out.println("str5.equalsIgnoreCase(str6) = " + str5.equalsIgnoreCase(str6));//true
            str2 = "murat";
            System.out.println("str5.equals(str6) = " + str5.equals(str6));// true

                /*
                equlas() ile == farkı...
                 */
            String s11 = "clarusway";//->Stribg pool variable-> gölek cebinde çıkan para
            String s22 = "clarusway";//->Stribg pool variable-> gölek cebinde çıkan para
            String s33 = new String("clarusway");//->String data type obj. non-primitive->heapmemory ->cüzdan
            String s44 = new String("clarusway");
            String s5=new String("dersler");

            ;//->String data type obj. non-primitive->heapmemory ->cüzdan
            System.out.println(s11 == s22);//True-> s11 ve s22 aynı String pool(ref değeri aynı) value de aynı
            System.out.println("s11.equals(s22) = " + s11.equals(s22));//true ->equals sadece value baktıgı için
            System.out.println("s33==s44 = " + s33 == s44);//false-> s33 ve s44 aynı değere sahip ama farklı obj oldg ref. değ farklı
            System.out.println("s33.equals(s44) = " + s33.equals(s44));//true ->equals sadece value baktıgı için

            String sAA="Kadir";
            String sBB="";
            sB=sA+"";

            System.out.println("sAA = " + sAA);//Kadir
            System.out.println("sBB = " + sBB);//Kadir

            System.out.println(sAA == sBB);//False
            System.out.println(sAA.equals(sBB));//True
            // equals() methodu sadece String'lerin degerlerini karsilastirir
            // bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur

 /*
 String s1 = “text”; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
 Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java’ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

 s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
 s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
 s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
 Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
 için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
 s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
         */
        }
    }





