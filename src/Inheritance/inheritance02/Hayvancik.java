package Inheritance.inheritance02;

public class Hayvancik {//Grand Parent Supr
int a;
int m=3;
    public Hayvancik() {//P'siz cons
        System.out.println("HAYVANCIK P'siz cons. call edildi");

    }

    public Hayvancik(int x) {
        System.out.println("HAYVANCIK P'li cons call edildi");
    }


    public void mA(){
        System.out.println("HAYVANCIK Class tan Meyhod call edildi");
    }

    public void mM(){//child de ezilen Mtod
        System.out.println("HAYVANCIK Class tan Meyhod call edildi");
    }


}
