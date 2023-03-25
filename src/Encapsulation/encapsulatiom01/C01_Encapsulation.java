package Encapsulation.encapsulatiom01;

public class C01_Encapsulation {
    public static void main(String[] args) {
 C02_Encapsulation obj = new C02_Encapsulation();
        System.out.println("obj.name = " + obj.name);
        obj.name="Ahmet Osman";
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.mailVer() = " + obj.mailVer());
        System.out.println("obj.ıdVer() = " + obj.ıdVer());
        System.out.println("obj.soyad = " + obj.soyad);
        obj.soyad="Başarılı";
        System.out.println("obj.soyad = " + obj.soyad);


    }//main sonu
}
