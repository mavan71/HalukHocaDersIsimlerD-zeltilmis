package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task22 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.

      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
        kokBulma();



    }

    private static void kokBulma() {
        System.out.println("Lütfen denklemin kat sayılarını giriz\na katsayısı :");
        int a=scan.nextInt();
        System.out.println("b katsayısı :");
        int b=scan.nextInt();
        System.out.println("c katsayısı :");
        int c=scan.nextInt();

        double delta=b*b - 4*a*c;
        if(delta<0){
            System.out.println("denklemin kökü yoktur");

        }else if(delta==0){
            System.out.println("denklemin 1 kökü vardır");
            double x=-b/(2*a);
            System.out.println("denklemin kökü" + x);
        }else {
            System.out.println("denklemin 2 kökü vardır");
            double x1=(-b + Math.sqrt (delta)) / (2*a) ;
            double x2= (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("denklemin kökleri :" + x1+" "+x2);
        }
    }


}
