package Baska;

import Deneme111.C01_AccessModifier;

public class C03_AccessModifierRunner {
    private String privateName="İsmail javaCAN";
    protected String protectedName="Can javaCAN";
    String defaultName="Erkan CAN";

    public String publicName="Murat";

    public static void main(String[] args) {

        C01_AccessModifier obj5=new C01_AccessModifier(45,77);

        System.out.println("obj5.publicyas = " + obj5.publicyas);
        //obj5.defaultYas//public haric (private,default ve protected)variable call edilemez.


    }

}
