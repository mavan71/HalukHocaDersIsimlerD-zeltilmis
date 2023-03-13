package j24_Encapsulation.encapsulation03;

import j24_Encapsulation.encapsulation03.Kisi;

public class KisiRunner {
    public static void main(String[] args) {
Kisi obj1 = new Kisi("Abdi","JavaCAN","ebikGabık1453",-33);

        System.out.println("obj1.getAd() = " + obj1.getAd());//Abdi
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());//JavaCAN
        System.out.println("obj1.getPassword() = " + obj1.getPassword());//ebikGabık1453
        System.out.println("obj1.getYas() = " + obj1.getYas());// 33


    }
}
