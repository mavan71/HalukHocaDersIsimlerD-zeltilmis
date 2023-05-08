package j99_Lambda.lambdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    public static void main(String[] args) {
        University u01 = new University("Bogazici", "Matematik", 571, 73);
        University u02 = new University("Istanbul", "Matematik", 622, 77);
        University u03 = new University("Marmara", "Hukuk", 1453, 52);
        University u04 = new University("Itu", "uçak muh.", 333, 63);
        University u05 = new University("Yıldız Teknik", "Gemi ", 216, 55);

        List<University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("   task01  ");
        System.out.println(controlNotOrt74Byk( unv)); // Agam unv notOrt 74 den buyuk deeel
        System.out.println("   task02  ");
        System.out.println(control110azOlmayanOgrcsayisi( unv)); // Unv öğrenci sayısı 110 dan fazla
        System.out.println("   task03  ");
        System.out.println(controlMathBol( unv)); // Unv en az bir bolum Matematik bulundurur¬
        System.out.println("   task04  ");
        System.out.println(printOgrcSayisiTersSıra(unv)); //
        System.out.println("   task05  ");

        System.out.println("   task06  ");

        System.out.println("   task07  ");

        System.out.println("   task08  ");

    }//main sonu
  // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
public static String controlNotOrt74Byk(List<University> unv){

        return unv.stream().allMatch(t->t.getNotOrt()>74)?"Agam unv notOrt 74 den  buyuk ":"Agam unv notOrt 74 den buyuk deeel";

}
    //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
    public static String control110azOlmayanOgrcsayisi(List<University> unv){
        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110)?
                "Unv öğrenci sayısı 110 dan fazla":
                "Unv öğrenci sayısı 110 dan az";
    }


    //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
    public  static  String controlMathBol(List<University> unv){
        return unv.stream().anyMatch(t->t.getBolum().contains("Mat"))?
                "Unv en az bir bolum Matematik bulundurur":
                "Unv en az bir bolum Matematik bulundurmaz";
    }

    //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
   public static List<University> printOgrcSayisiTersSıra(List<University> unv){
       return unv
                .stream()
                .sorted(Comparator.comparing(University::getOgrcSayisi).reversed())//akışelamanları ogrcSayisina göre ters sıralandı
                .collect(Collectors.toList());//akışdaki elemanlar liste atandı
   }
    //task05->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz..
    //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz.
    //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz.
    //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz.



}
