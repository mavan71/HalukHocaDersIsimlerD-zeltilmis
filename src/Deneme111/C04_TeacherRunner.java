package Deneme111;

public class C04_TeacherRunner {

    public static void main(String[] args) {

        C04_Teacher ogrt1=new C04_Teacher();
        ogrt1.ad="haluk";
        ogrt1.saoyad="bilgin";
        ogrt1.brans="Java backend dev";
        ogrt1.maas=4000;
        ogrt1.emeklilik=false;
        ogrt1.tecrube=11;
        System.out.println("ogrt1 = " + ogrt1);//referans değerleri alırım.ogrt1 = Deneme111.C04_Teacher@5f2050f6
    C04_Teacher cincixOgrt=new C04_Teacher("bahtiyar", "JavaCAN", "java", 1905, 11,8500, false);
        System.out.println("cincixOgrt = " + cincixOgrt);

    }//Main sonu
}//class sonu
