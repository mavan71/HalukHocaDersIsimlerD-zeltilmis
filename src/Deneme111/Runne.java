package Deneme111;

public class Runne {
    public static void main(String[] args) {


       // C01_AccessModifier obj1 =new C01_AccessModifier();//private cons dan obje call edilemez
        C01_AccessModifier obj1 =new C01_AccessModifier(34,45);//public olan cons tan obje uretildi

Runne obj2=new Runne();
        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protecdedYas = " + obj1.protecdedYas);
        System.out.println("obj1.publicyas = " + obj1.publicyas);
        //obj1.privateYas//private veraible class korumalı olduğundan ulaşamıyoruz
        //obj1.privateMethod//private veraible class korumalıdır
        //C01_AccessModifier.privateMethod//

    }
}
