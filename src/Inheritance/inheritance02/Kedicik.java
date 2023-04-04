package Inheritance.inheritance02;

public class Kedicik extends Mammal{

    int c=2;
    int d=7;

    public Kedicik() {
        super();
        System.out.println("KEDİCİK P'siz cons. call edildi");
    }

    public Kedicik(String str) {
        this();
      
        System.out.println(super.c);
        System.out.println("Ağam Ahanda Kedicik P'li cons call edildi");
    }


}
