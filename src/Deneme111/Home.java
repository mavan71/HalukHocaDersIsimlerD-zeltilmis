package Deneme111;

public class Home {
    //fields
    String renk="White";
    String manzara="Var";
    int metreKare=250;
    int yil=2023;

    public Home() {
    this(200);
        System.out.println("0 paremetreli constructor");
    }

public Home (int metreKare){
        this.metreKare=metreKare;
    System.out.println("1 paremetreli constructor");
}

    public Home(String white, String var, int yil) {
        System.out.println("3 paremetreli constructor");
    }

    public Home(String white, int yil) {
        System.out.println("2 paremetreli constructor");
    }

    public Home(String var, int i, String white) {
        System.out.println("3 paremetreli constructor");
    }
}
