package Deneme111;

public class C05_Arac {
    //Fields-> obj'nin uretilirken alacagı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */
//fields
    String model;
    int maxHiz;

    public C05_Arac(int maxHiz) {
        this("Haci Murat",124);
        //this();
        //this.maxHiz = maxHiz;
        System.out.println("Ağam Bu yazıyı okuduysan 1 P'li  cons call edilmiştir.");
    }

    public C05_Arac() {
        System.out.println("Ağam Bu yazıyı okuduysan Parametresiz cons call edilmiştir.");
    }

    public C05_Arac(String model, int maxHiz) {
        this.model = model;
        this.maxHiz = maxHiz;
        System.out.println("Ağam Bu yazıyı okuduysan ZENGİN cons call edilmiştir.");
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz;
    }
}
