package J07_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {
                /*
        concat() -> methodu içinde parametre alığı String variable'yi çalşıtığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
        1ile 5 i toplarsan 6 eder concat edersen 15 olur.
         */
        String qa="savfet";
        String lead ="Vedat";
        qa.concat(lead);//qa String sonuna lead string birleştirildi.->SafvetVedat
        System.out.println("qa.concat(lead) = " + qa.concat(lead));////qa String sonuna lead string birleştirildi.->SafvetVedat
        System.out.println("ilk qa :" +qa);////Safvet ->qa.concat(lead) method'da  atama yapılmadı
 /*
        ahan da TRİCK-> String methodları variable'yi kalıcı değil geçici değişiklik yapar.
        String'de kalıcı değişklik yapmak için atama yapılır...
         */



        qa=qa.concat(lead);
        System.out.println(" atamadan sonraki qa = " + qa);
        qa=lead.concat(qa);
        System.out.println("en son atamadan sonra qa = " + qa);
        System.out.println( qa.concat("true"));
        System.out.println(lead.concat(true + "dolar"));//Vedattruedolar
        System.out.println(lead.concat(53 +  "çay"));//Vedat53çay
        System.out.println(lead.concat(53 +""));//Vedat53

 /*
        Trick-> concat methodu parametre olarak String harici tüm dataları Stringe çevirip concat eder.
         String mürekkep gibi bulundugu ortamda diğer dataları etkiler.
         */

    }
}
