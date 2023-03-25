package Encapsulation.encapsulatiom01;

public class C02_Encapsulation {//pojo class
       /*
    Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
    Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
    veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
    kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
    basit bir veri nesnesi olabilirler. POJO'lar, genellikle diğer nesneler veya bileşenlerle
     işbirliği yapmak için kullanılırlar ve bu nedenle veri aktarım nesneleri (DTO) olarak da adlandırılabilirler.
     */
        //fields
    String name="Ali ";
    private int id=1001;
    private String mail="mavan71@gmail.com";
    String soyad="Guzel";


    public C02_Encapsulation() {//P'siz cons.
    }
    public C02_Encapsulation(String name, int ıd, String mail) {//p'li cons.
        this.name = name;
        this.id = id;
        this.mail = mail;
    }


    public  String mailVer() {
        return mail;
    };

    public int ıdVer() {
    return id;
    }


}//class sonu
