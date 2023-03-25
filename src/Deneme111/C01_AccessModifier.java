package Deneme111;

public class C01_AccessModifier {
    /*
             1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir. 	b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
*/
    private int yas=33;
    int defaultYas=24;//Access Modifier yazılmazsa default olarak tanımlanır
    protected int protecdedYas=45;
    public int publicyas=56;
        private C01_AccessModifier(){
            System.out.println("Ağam p siz private cons. dan Selamkee");
        }
    public C01_AccessModifier(int privateYas,int defaultYas){
        System.out.println("Ağam p li public cons. dan Selamkee");
    }
       // C01_AccessModifier obj=new C01_AccessModifier();//privet Class tanobj creat edildi.


    private void privateMeth(){
        System.out.println("Ağam p siz private meth. dan Selamkee");
    }
    public void publicMeth(){
        System.out.println("Ağam p siz public meth. dan Selamkee");
    }



    protected void protectedMeth(){
        System.out.println("Ağam p siz protected meth. dan Selamkee");
    }
}
