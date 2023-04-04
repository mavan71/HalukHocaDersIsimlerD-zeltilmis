package Inheritance.inheritance02;

public class Mammal extends Hayvancik{

    int m=1;
    int c=4;

    public Mammal() {
        this('H');//Bu clas dan P'li cons. call edildi.
        System.out.println("Ağam MAmmal P'siz Cons ");
    }

    public Mammal(char y) {
        super(34);//super class dan p'li cons call edildi
        System.out.println("Mammal P'li cons. call edildi");
    }
    public void mC(){
        System.out.println("mC Mammal Class Method call");
    }
    @Override//annotation (dip not)//Override ezmek demek
    public void mM(){//parent te ezen Meth
        System.out.println("mM Mammal Class Method call");
    }

}
