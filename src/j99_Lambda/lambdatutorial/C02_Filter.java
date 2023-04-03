package j99_Lambda.lambdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        System.out.println("   task01   ");
        printCiftElStructured(sayiList);// 58 54 38 46 16
        System.out.println("\n   task02   ");
        printCiftElFunctional(sayiList);// 58 54 38 46 16
        System.out.println("\n   task03   ");
        printElCiftOtzbsKckFunctional( sayiList); // 16
        System.out.println();
        printElTekOtsdrtBykFunctional( sayiList);

    }//main sonu



    //task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

    public static void printCiftElStructured(List<Integer> sayiList) {

        for (Integer s : sayiList) {
            if (s % 2 == 0) {
                System.out.print(s + " ");
            }
        }
    }

    //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz


    public static void printCiftElFunctional(List<Integer> sayiList) {
        sayiList //aksiyona girecek list collecting
                .stream()//list elemanlrı akısa alındı
                //.filter(t->t%2==0)//akısdaki list eamnalrı parametreye göre filtrelendi
                .filter(C01_LambdaExpression::ciftMi)//akısdaki list eamnalrı parametreye göre filtrelendi
                .forEach(C01_LambdaExpression::yazdir);//akısada her bir eleman  filtrelenerek yazdır meth refere edilere print edildi
    }
    //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

    public static void printElCiftOtzbsKckFunctional(List<Integer> sayiList) {
        sayiList
                .stream()//58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16
               .filter(C01_LambdaExpression::ciftMi ) //akısdaki elemanların ciftlerini fitlreler -> 58 54 38 46 16
                //.filter( t->t<35 && t%2==0)
                .filter( t->t<35 ) // akısadaki elemanların 35 den kucuk molanlarını filtreler -> 16
                .forEach(C01_LambdaExpression::yazdir); // 16


    }
    public static void printElTekOtsdrtBykFunctional(List<Integer> sayiList) {
        sayiList
                .stream()//58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16


                .filter( C02_Filter::seed ) // akısadaki elemanların 35 den kucuk molanlarını filtreler -> 16
                .forEach(C01_LambdaExpression::yazdir); // 16


    }
  public static boolean seed(int a){
        return a>34||a%2==1;
  }

}
