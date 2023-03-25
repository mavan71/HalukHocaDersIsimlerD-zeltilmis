package j30_Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task011 {

/*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */


    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<String>(Arrays.asList("Murat","javaCAN","javaTAR","Abdi bey"));
        Scanner input =new Scanner(System.in);

        System.out.println("Bir string gir");
        String str=input.nextLine();

            for (int i = 0; i < ll1.size(); i++) {
                if(ll1.get(i).equals(str)){
                    ll1.remove(ll1.get(i));
                }
            }
        System.out.println(ll1);






    }



}
