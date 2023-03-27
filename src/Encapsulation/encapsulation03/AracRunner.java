package Encapsulation.encapsulation03;

public class AracRunner {
    public static void main(String[] args) {

Arac obj1=new Arac("Toyota","gümüş",600,-1905);
Arac obj2=new Arac("Honda","yaşil",1500,2017);
Arac obj3=new Arac();
        System.out.print(obj1.getModel()+" ");
        System.out.print(obj1.getRenk ()+" ");
        System.out.print(obj1.getMotor()+" ");
        System.out.print(obj1.getYil  ()+" ");
        System.out.println();
        System.out.print(obj2.getModel()+" ");
        System.out.print(obj2.getRenk ()+" ");
        System.out.print(obj2.getMotor()+" ");
        System.out.print(obj2.getYil  ()+" ");
        System.out.println();
        System.out.print(obj3.getModel()+" ");
        System.out.print(obj3.getRenk ()+" ");
        System.out.print(obj3.getMotor()+" ");
        System.out.print(obj3.getYil  ()+" ");
            System.out.println();
        obj3.setYil(-1500);
        obj3.setMotor(2000);
        obj3.setRenk("Gri");
        obj3.setModel("haci Murat");
            System.out.println();
            System.out.print(obj3.getModel()+" ");
            System.out.print(obj3.getRenk ()+" ");
            System.out.print(obj3.getMotor()+" ");
            System.out.print(obj3.getYil  ()+" ");
            System.out.println();
            System.out.println(obj1);
            System.out.println(obj2);

    }
}
