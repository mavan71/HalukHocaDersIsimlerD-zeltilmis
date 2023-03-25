package Encapsulation;

public class MainClass {

    private String memleket="Ankara";
    public static void main(String[] args) {


        personel obj =new personel();

        System.out.println("obj.getName() = " + obj.getName());


   obj.setYas(10);
        System.out.println("obj.getYas() = " + obj.getYas());
    obj.setName("Murat");
        System.out.println("obj.getName() = " + obj.getName());
    MainClass obj1=new MainClass();
    obj1.memleket="Amasya";
        System.out.println("obj1.memleket = " + obj1.memleket);


    }
}
