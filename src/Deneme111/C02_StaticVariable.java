package Deneme111;

public class C02_StaticVariable {
        /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */
        static String firmaIsmi="Clarusway";
        static int firmaId;
        static boolean firmaIt;



    public static void main(String[] args) {
        System.out.println("firmaId = " + firmaId);
        System.out.println("firmaIsmi = " + firmaIsmi);
        System.out.println("firmaIt = " + firmaIt);
        firmaIt=true;
        C02_StaticVariable.firmaId=2021;
        staticMeth();
       // non_staticMeth();//non static Meth doğrudan call edilemnez

    }//main sonu
    public static void staticMeth(){
        System.out.println("firmaId = " + firmaId);
        firmaId=2023;
        System.out.println("firmaId = " + firmaId);

    }
    public void non_staticMeth(){
        System.out.println("firmaIsmi = " + firmaIsmi);
        firmaIsmi="Offer'e en kısa yol";
        System.out.println("firmaIsmi = " + firmaIsmi);
        staticMeth();
    }
}//Class sonu
