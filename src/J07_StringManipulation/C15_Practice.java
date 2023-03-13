package J07_StringManipulation;

import java.util.Scanner;

public class C15_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("agam paswort gir");
        String str=input.nextLine();


        if(str.length()==8){
            System.out.println("8 karakter girmelisin");
        }
    }
}
