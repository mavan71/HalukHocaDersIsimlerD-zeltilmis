package j27_Abstract.abstract01;

public class Crv extends Honda{

    @Override
    public void motor() {
        System.out.println("Ağam 2.4 super turbo Motor arazi bekler seni");
    }

    @Override
    void kapı() {
        System.out.println("Ağam Kapılar Kale gibi");
    }

    @Override
    void koltuk() {
        System.out.println("Ağam Deri Koltuk arazide daha rahat");
    }
}
