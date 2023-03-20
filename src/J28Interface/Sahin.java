package J28Interface;

public class Sahin extends Tofas implements DisDonanim,IcDonanım,Ilastik{
    @Override
    public void motor() {
        System.out.println("Ağam 1.6 çok yakar az kaçar MOTOR");
    }

    @Override
    public void yakit() {
        System.out.println("Ağam Tüp tak çok yakar");
    }

    @Override
    public void kapi() {
        System.out.println("Ağam 4 KAPI sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Ağam akordion KAPORTA gamesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("Ağam deri KOLTUK yazin pişik yapar aman içi saman olmasın");
    }

    @Override
    public void klima() {
        System.out.println("Ağam aç camı serinle KLİMA senin neyine");
    }

    @Override
    public void ebat() {
        System.out.println("Ağam 15 inç LASTik"        );
    }

    @Override
    public void jant() {
        System.out.println("Ağam senin gibi JANTİ teker çoğğ şekerr");
    }
}
