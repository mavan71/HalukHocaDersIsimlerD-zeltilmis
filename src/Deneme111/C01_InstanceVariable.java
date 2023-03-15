package Deneme111;

public class C01_InstanceVariable {

//fields
    int yas=48;
    int tecrube;
    String name;
    boolean developerMi;
    double boy;
    char unvan;
    static String kurs="Clarusay";//initial edilmiş  static variable
    static String programLanguage;//initial edilmemiş  static variable


    public static void main(String[] args) {
    //static int a=17;//static blokta static variable tanımlanamaz
    int a=17;//local variable
        System.out.println("a = " + a);
        int b;
        b=63;
        System.out.println("b = " + b);
        //System.out.println("b = " + b);//initial edilmemiş variable local de action almaz
        //System.out.println("yas = " + yas);//instance variable obje variable dir bu nedenle obj esiz kullanılmaz
        System.out.println("kurs = " + kurs);//initial edilmiş static variable static variable call edilebilir. Astral seyahat galaksiler arası

        System.out.println("programLanguage = " + programLanguage);//initial edilmiş static variable static variable dogrudan call edilebilir
        static_Method();//static method doğrudan call edildi
        //non_static_Method();//static bloga non static metdhod doğrudan call edilemez
        C01_InstanceVariable obj=new C01_InstanceVariable();//obje creat edildi
        obj.non_Static_Method();//non static method doğrudan call edilemez.ancak obje ile çağrılır.
        System.out.println("obj.developerMi = " + obj.developerMi);//non static instance variable static variable doğrudan call edilemez ancak obje ile call edilebilir.



    }//main sonu
    public void  non_Static_Method(){//non static Method
        System.out.println("Non static Method dan selamlar");
    }
    public static void static_Method(){//static Method dan selamlar
        System.out.println("static methoddan selamlar");
    }
}
