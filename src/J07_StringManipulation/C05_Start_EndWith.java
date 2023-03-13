package J07_StringManipulation;

public class C05_Start_EndWith {
    public static void main(String[] args) {


    /* startWith Bununla Başlıyormu
    endWith  sonunun eşlenipeşlenmediğini kontrol eder
     */
    String name = "Mustafa";
        System.out.println(name.startsWith("m"));//false
        System.out.println(name.startsWith("M"));//cte verir parametre char olmaz//true
        //
        System.out.println(name.startsWith("Mu"));//false


        System.out.println(name.endsWith("fa")  );//true
        System.out.println(name.endsWith("a")  );//false
        System.out.println(name.endsWith("x")  );//false
        String str="ebikGabık";
        



    }
}
