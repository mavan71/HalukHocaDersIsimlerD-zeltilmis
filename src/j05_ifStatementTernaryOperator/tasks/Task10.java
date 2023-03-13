package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir Notunuzu giriniz");
        int not=scan.nextInt();

        if(not>=80 && not<=100) {
            System.out.println("A");
        }else if (not>=60&& not<80) {
            System.out.println("B");
        }else if (not >=50 && not <60)
        {
            System.out.println("C");
        } else if (not <50 && not >=0) {
            System.out.println("D");
        } else System.out.println("Sıfırla 100 arası not girin");








    }


}
