package j26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task-->Girilen password un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code creat edeniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Password Gir");
        String password = input.nextLine();
        try {
            if(password.length()<6||password.length()>10){
                throw new IllegalArgumentException("Ağam Password 6 da kucuk yada 10 dan buyuk");
            }else System.out.println("Ağam Başarılı");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()+"Ağam tekrar gir");
            System.out.println("Ağam hatalı ama handle ettik");
        }
        System.out.println("app. çalışrtı");
    }
}
