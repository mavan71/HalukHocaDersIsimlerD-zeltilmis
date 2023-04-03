package Deneme111.Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>(Arrays.asList( 7,3, 11, 4, 12, 2, 5, 17));
        List<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        printElStructuore(list1);
        printEl( list1);
        printElkaresi(list1);
        printElKupu(sayiList);
        System.out.println();
        System.out.println("   ***1   ");
        printElfunctional5( sayiList);
        System.out.println();
        System.out.println("   ***2   ");
        printElCiftMiFunctional(sayiList);
        System.out.println();
        System.out.println("   ***3   ");
        printElTekMiFunctional(sayiList);
        System.out.println();
        System.out.println("   ***4   ");
        printElKirkdnBykFunctional(sayiList);
        System.out.println();
        System.out.println("   ***5   ");
        printElKirkdnBykCiftFunctional(sayiList);
        System.out.println();
        System.out.println("   ***6   ");
        printElKirkdnBykTekFunctional(sayiList);
        System.out.println("   task07   ");
        printCiftElKareFunctional1( list2);//16 144 4
        System.out.println("   task08   ");
        printCiftElKareFunctional1( list2);//16 144 4

    }//main sonu

    private static int kareAll(int a) {
        return a*a;
    }

    private static void printCiftElKareFunctional1(List<Integer> list2) {
        list2.stream().filter(t->t%2==0).map(t->t*t).forEach(t-> System.out.print(t+" "));
        list2.stream().filter(t->t%2==0).map(t->(int)Math.pow(t,2)).forEach(t-> System.out.print(t+" "));
        list2.stream().filter(t->t%2==0).map(Lambda1::kareAll).forEach(t-> System.out.print(t+" "));
    }

    private static void printElKirkdnBykTekFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t>40).filter(Lambda1::Tekmi).forEach(Lambda1::yazdiiir);//41 59 65 61 45

    }

    private static void printElKirkdnBykCiftFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t>40).filter(t->t%2==0).forEach(t-> System.out.println(t+" "));
    }

    private static void printElKirkdnBykFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t>40).forEach(t-> System.out.print(t+" "));
        sayiList.stream().filter(t->t>50).forEach(t-> System.out.print(t+" "));
    }

    private static void printElTekMiFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t%2==1).forEach(t-> System.out.print(t+" "));
    }

    private static void printElCiftMiFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));


    }

    private static void printElfunctional5(List<Integer> sayiList) {
        sayiList.stream().forEach(Lambda1::yazdiiir);
    }

    private static void printElStructuore(List<Integer> list1) {
        for (Integer avuc:list1) {
            System.out.print( avuc+" ");//1 2 3 4 5 6 7 8 9 10 11
        }
        System.out.println();
        for (int i = 0; i < list1.size(); i++) {
            System.out.print( list1.get(i)+" ");//1 2 3 4 5 6 7 8 9 10 11
        }
        System.out.println();
    }

    private static void printElKupu(List<Integer> sayiList) {
        sayiList.stream().forEach(t-> System.out.print(t*t*t+" "));//195112 343 157464 68921 205379 35937 54872 2197 274625 226981 97336 91125 15625 4096
    }

    private static void printElkaresi(List<Integer> list1) {
        list1.stream().forEach(t-> System.out.print(t*t+" "));//1 4 9 16 25 36 49 64 81 100 121
        System.out.println();
    }

    public static void printEl(List<Integer> list1){
    list1.stream().forEach(t-> System.out.print(t+" "));//1 2 3 4 5 6 7 8 9 10 11
    System.out.println();
    list1.stream().forEach(System.out::print);//1 2 3 4 5 6 7 8 9
}
    public static void yazdiiir(int a){
        System.out.print(a+" ");
    }
    public static boolean Tekmi (int a){
        return a>40&&a%2==1;
    }
}//class sonu
