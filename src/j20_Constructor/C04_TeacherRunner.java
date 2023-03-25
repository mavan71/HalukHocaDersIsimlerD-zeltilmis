package j20_Constructor;

public class C04_TeacherRunner {//class level
    public static void main(String[] args) {//main level


        C04_Teacher ogrt1=new C04_Teacher();//p'siz default cons. ile obj. create edildi
        ogrt1.ad="haluk";
        ogrt1.soyad="bilgin";
        ogrt1.brans="java backend dev";
        ogrt1.maas=4000;
        ogrt1.tecrube=11;
        System.out.println("ogrt1 = " + ogrt1);//ref:j20_Constructor.C04_Teacher@edf4efb

        C04_Teacher cincixOgrt=new C04_Teacher("bahtiyar","javaCAN","java",1905,3,8500,false);


        System.out.println("cincixOgrt = " + cincixOgrt);


    }//main sonu
}//class sonu
