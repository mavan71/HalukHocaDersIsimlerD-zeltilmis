package j28_Interface;

public interface DisDonanim {//interface de her şe y publik abstract final static olmak zorunda sen yazmasanda java bunları otomatik alır


    void kapi();//public abs meth.
   // public abstract void kaporta();
    void kaporta();
    String RENK="gırmıızı";//public static final initial variable
    public default String sislamba(){//public default concreat meth. obj ile call olur
        return "sisli havada Mutlaka kullanılmalı";

    }
    public static void anten(){//public static concreat meth. interacename ile call olur
        System.out.println("Ağam Kantin anten işlerindesin");

    }
    //  public static void main(String[] args) {//interface main meth tanımlanabilir ama BAD PRACTICE
    //      anten();//meth call
    //     // sisLamp();nan-statcik meth  objszcall edilemez
    //  }
    //   DısDonanım obj=new DısDonanım();//ınterface obj create edemzzzzzz
}
