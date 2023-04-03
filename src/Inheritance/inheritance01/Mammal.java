package Inheritance.inheritance01;

public class Mammal extends Hayvancik{//mamal child Hayvancik parent

    public Mammal() {
        System.out.println("Ağam Parametresiz Mammal cons tructor call edildi");
    }

    public void sutBeslen(){
        System.out.println("Bebeleri süt ile besler");
    }
    public void dogum(){
        System.out.println("Nur topu gibi yavrusu olur");
    }


}
