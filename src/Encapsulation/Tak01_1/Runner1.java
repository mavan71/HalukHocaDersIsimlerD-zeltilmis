package Encapsulation.Tak01_1;

public class Runner1 {
    public static void main(String[] args) {


  Bm1i ahmetAga =new Bm1i("Ahmet",33,89.30,1.80);
        System.out.println("ahmetAga = " + ahmetAga+" " +ahmetAga.getStatus());
        Bm1i muratAga =new Bm1i("Murat",51,82.24,1.73);
        System.out.println("ahmetAga = " + muratAga+" " +muratAga.getStatus());
        System.out.println("    *****     ");
        System.out.println("ahmetAga = " + ahmetAga);
        System.out.println("muratAga = " + muratAga);
    }
}
