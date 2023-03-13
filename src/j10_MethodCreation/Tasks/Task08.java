package j10_MethodCreation.Tasks;


import java.util.Scanner;

public class Task08 {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */

        System.out.println(artikYılMı());

    }

    private static boolean artikYılMı() {
        System.out.println("Bir yıl giriniz :");
        int yil = input.nextInt();
        if (yil % 4 == 0) {
            return true;

        } else if (yil % 100 == 0) {
            return false;

        } else if (yil % 400 == 0) {
            return true;

        }else  return false;



    }
}

