package j99_Lambda.lambdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList( 7,3, 11, 4, 12, 2, 5, 17));

        System.out.println("   task01   ");
        printCiftElKareFunctional( sayiList);//16 144 4
        System.out.println("\n   task02   ");
        printElTekKup1Fazla( sayiList);
        System.out.println("\n   task03   ");
        printElCiftKarakokFuctional( sayiList);
        System.out.println("\n   task04   ");

    }//main sonu


    // task 01 listin çift elamanlarının karelerini aynı satıra aralarında boşluk bırakarak print ediniz
    public static void printCiftElKareFunctional(List<Integer> sayiList){
        sayiList
                .stream()//7,3, 11, 4, 12, 2, 5, 17//list elemanları alkışa alındı
                .filter(C01_LambdaExpression::ciftMi)//4,12,2//akıştaki elamanlar çifte göre filtrelendi
                //.map(t->t*t)//16, 144, 4//çift elamanların karesi alındı//1.cözüm
                //.map(t->(int)Math.pow(t,2))////2.cözüm
                .map(C03_Map::kareAl)////3.cözüm
                .forEach(C01_LambdaExpression::yazdir);//karesi alınan herbir elaman yazdırıldı
//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

    }
public static int kareAl(int a){
    return a*a;
}
public static void printElTekKup1Fazla(List<Integer> sayiList){
    sayiList
            .stream()//7,3, 11, 4, 12, 2, 5, 17//list elemanları alkışa alındı
            .filter(t->t%2==1)//4,12,2//akıştaki elamanlar çifte göre filtrelendi
            //.map(t->t*t)//16, 144, 4//çift elamanların karesi alındı//1.cözüm
            .map(t->(int)Math.pow(t,3)+1)////2.cözüm

            .forEach(C01_LambdaExpression::yazdir);//karesi alınan herbir elaman yazdırıldı


}

// Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print ediniz.
public static void printElCiftKarakokFuctional(List<Integer> sayiList){

    sayiList
            .stream()//7,3, 11, 4, 12, 2, 5, 17//list elemanları alkışa alındı
            .filter(t->t%2==0)//4,12,2//akıştaki elamanlar çifte göre filtrelendi
            //.map(t->t*t)//16, 144, 4//çift elamanların karesi alındı//1.cözüm
            .map(t->(int)Math.sqrt(t))////2.cözüm

            .forEach(C01_LambdaExpression::yazdir);//karesi alınan herbir elaman yazdırıldı
    sayiList.stream().filter(t->t%2==0).map(t->(int)Math.sqrt(t)).forEach(C01_LambdaExpression::yazdir);//2.çözüm
}


}//claas sonu
