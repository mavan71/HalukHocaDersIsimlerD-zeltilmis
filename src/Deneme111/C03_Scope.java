package Deneme111;

public class C03_Scope {//Class sonu

    public static void main(String[] args) {
        C01_InstanceVariable obj =new C01_InstanceVariable();//Farklı Classtan obje ürettik
        C02_StaticVariable obj2=new C02_StaticVariable();

    obj.non_Static_Method();//non static meth obj ile call edilir
        C01_InstanceVariable.static_Method();//Static Meth Class name ile çağrılır

    obj.developerMi=true;//instance variable obje ile ulaşılır.
        System.out.println("obj.developerMi = " + obj.developerMi);
        System.out.println("C01_InstanceVariable.kurs = " + C01_InstanceVariable.kurs);//static variable ye class ismiyle ulaşılır


    }



}
