package J07_StringManipulation;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length() methodu girilen stringin uzunluğunu içinde bulunan karakter sayısını return eder.
        butun karakterleri sayar sayısını verir.

         */
            String str="madem geldin dünyaya otur çalış JAVA'ya :)";
            System.out.println(str.length());
//String str="madem geldin dünyaya otur çalış javaya :)";
       // System.out.println(str.length() );//41
        int karakterSayısı=str.length();
        System.out.println("karakterSayisi = " + karakterSayısı);

        String str1=" ";
            System.out.println("str1.length() = " + str1.length());

            String str2="";
           System.out.println("str2.length() = " + str2.length());
            String str3=null;
        System.out.println("str3.concat(str1) = " + str3.concat(str1));
        //System.out.println("str3.length() = " + str3.length());//Runtime Hatası verdi (çalışınca ortaya çıkan hata)
           // //  String str1=" ";                                    //Compile Hatası Derleme Hatasıdır. altını kode yazarken kırar.
     //  System.out.println("str1 = " + str1.length());//1
     //  String str2="";
     //  System.out.println("str2 = " + str2.length());//0
     //String str4=null;
     //  System.out.println(str3.concat(str1));//RTE Runtime Time Eroror
     //  //System.out.println("str3 = " + str3.length());//runtimr exception
/*
Triick : null atanan Stringler herhangi bir method call etmez çalışmaz
null: case sensitive Null NULL != null
null: bir değer değil(dutluk) sadece hiçliği gösteren bir pointetrdir.
çocuk hatayı evde görürse compile time eror
bakkalda görürse runtime eror

 */
        String name;//declare edilmiş atanmamış
       // name.concat(str1);//atanmamış (initilaze edilmemiş

        System.out.println("\"agam code cıncık devamke\" = " + "agam code cıncık devamke");

         /*
    package j07_StringManipulation;

    public class C02_Length {
        public static void main(String[] args) {
/*
        length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir//length karakter sayısı
         */
   //   String str5="madem geldin dünyaya otur çalış JAVA'ya :)";
   //   System.out.println(str5.length());
   //   // String str="madem geldin dünyaya otur çalış JAVA'ya :) ";
   //   //System.out.println(str.length());//43
   //   int karktrSayisi=str.length();//str'ni length'i int type bir variable atandı
   //   System.out.println("karktrSayisi = " + karktrSayisi);//43

   //   String str6=" ";
   //   System.out.println("str1 = " + str6.length());//1

   //   String str2="";
   //   System.out.println("str2 = " + str2.length());//0

   //   String str3=null;//cte vermez
   //   //  System.out.println(str3.concat(str1));//RTE

   //   //  System.out.println("str3 = " + str3.length());//rte-run timem exception
   //   /*
   //   Trick-> null atanan String'ler herhangi bir method call etmez çalışmaz
   //ull -> case sensitive Null NULL !=null
   //ull-> bir değer değil(dutluk) sadece hiçliği gösteren bir bir pointer(işaretçi)
   //    */

   //   String name;//declera edilmiş ama atanmamış bir String type variable

   //   //name.concat(str1);//atanmamış(initilaze edilmemiş) string method call etmez.CTE (compile time Errror) verir
   //   System.out.println("agam code cincik dewamkeee");
    }





}



//kage j07_StringManipulation;

//     public class C02_Length {
//         public static void main(String[] args) {
//
//     length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
//     butun karakterleri(boşluk vs) sayıp adedini verir//length karakter sayısı
//      */
//             String str="madem geldin dünyaya otur çalış JAVA'ya :)";
//             System.out.println(str.length());
//             // String str="madem geldin dünyaya otur çalış JAVA'ya :) ";
//             //System.out.println(str.length());//43
//             int karktrSayisi=str.length();//str'ni length'i int type bir variable atandı
//             System.out.println("karktrSayisi = " + karktrSayisi);//43

//             String str1=" ";
//             System.out.println("str1 = " + str1.length());//1

//             String str2="";
//             System.out.println("str2 = " + str2.length());//0

//             String str3=null;//cte vermez
//             //  System.out.println(str3.concat(str1));//RTE

//             //  System.out.println("str3 = " + str3.length());//rte-run timem exception
//     /*
//     Trick-> null atanan String'ler herhangi bir method call etmez çalışmaz
// null -> case sensitive Null NULL !=null
// null-> bir değer değil(dutluk) sadece hiçliği gösteren bir bir pointer(işaretçi)
//      */

//             String name;//declera edilmiş ama atanmamış bir String type variable

//             //name.concat(str1);//atanmamış(initilaze edilmemiş) string method call etmez.CTE verir
//             System.out.println("agam code cincik dewamkeee"); */