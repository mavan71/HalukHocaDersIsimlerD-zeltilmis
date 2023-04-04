package Inheritance.inheritance01;

public class Mammal extends Hayvancik{//Hayvancik Parent class, Mammal Child class

    public Mammal() {//p' siz cons
        System.out.println("P'siz Mammal Cons. call edildi");
    }
    public void sutBeslen(){
        System.out.println("Bebeleri sut ile besler");
    }

    public void dogum(){
        System.out.println("Nu topu gibi yavrusu olur");
    }



}
