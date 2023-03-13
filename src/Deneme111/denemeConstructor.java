package Deneme111;

//fields


public class denemeConstructor {
    String marka="Volvooo";
    String model;
    int yil;

    public denemeConstructor(){

    }

    public denemeConstructor(String marka, int yil,String model){
        this.marka=marka;
        this.model=model;
    }

    public static void main(String[] args) {
        denemeConstructor arc1=new denemeConstructor();
        System.out.println(arc1.marka);
        denemeConstructor arc2=new denemeConstructor("Volvo",2014,"fiat");
        System.out.println("(arc.marka+arc.yil) = " + (arc2.marka +","+ arc2.yil+","+arc2.model));
    }

}
