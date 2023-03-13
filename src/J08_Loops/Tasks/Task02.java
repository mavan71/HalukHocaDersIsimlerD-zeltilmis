package J08_Loops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz :");
        String kelime=sc.nextLine();
        int kUzunluk=kelime.length();
        int i;
        int bas=0;
        int son=kUzunluk-1;
        int orta =(bas+son)/2;
        for ( i=bas; i<=orta; i++){
            if (kelime.charAt(bas)==kelime.charAt(son)){
                bas++;
                son--;
            }else break;
        }
        if(i==orta+1){
            System.out.println("girdiğiniz Kelime Polindrome dur");
        }
        else
            System.out.println("girdiğiniz Kelime Polindrome degil");
    }


}
