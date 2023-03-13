package Deneme111;

import java.util.Scanner;

public class denemesoru {
    public static int factoriel(int a){
        if (a==0||a==1){
            return 1;

        }else {
            return a *factoriel(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bir numara giriniz");
        int n=s.nextInt();
        int fact=factoriel(n);
        System.out.println(fact);


    }
}
