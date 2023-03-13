package J20_Constructor;

public class C05_Arac {//obj kalıphanesi
    //Fields-> obj'nin uretilirken alacagı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */

    //fields..
    String model;
    int maxHiz;

    public C05_Arac() {//p'siz sefil cons.
        System.out.println("Agam bu yazıyı sefil p'siz cons call edilmiştir...");
    }

    public C05_Arac(int maxHiz) {//1 int  p'li cons.
        this("hacıMurat", 124);//zengin cons call edildi.
        // this();//aynı cons body'de 1den fazla cons. cal edilemezzz->CTE
        this.maxHiz = maxHiz;//p'den gelen maxHiz value inst. variable this ile atandı ki obj ints variable dan parametre value alsın
        // maxHiz = maxHiz;//p'den gelen maxHiz value inst. variable değil yine parametre variable atandı  obj ints variable dan default value alsın
        //this("hacıMurat",123);//cons body içinde daima ilk satıra call edilmeli aksi takdirde -> CTE
        System.out.println("Agam bu yazıyı okuduysan 1 int  p'li  cons call edilmiştir...");
    }

    public C05_Arac(String model, int maxHiz) {//full p'li telescopic cons->zengin cons.
        this.model = model;
        this.maxHiz = maxHiz;

        System.out.println("Agam bu yazıyı okuduysan ZENGİN cons call edilmiştir...");
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", maxHiz=" + maxHiz;
    }
}
