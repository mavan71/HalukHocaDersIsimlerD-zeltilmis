package Deneme111;

import java.util.Scanner;

public class DenemeWhileLoop {
    public static void main(String[] args) {
        //3 ile 20 arasındaki sayıları yazdırın
        int i=3;

        while(i<=20) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (int j = 3; j <=20; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
        int j=1;
        while(j<=7) {
            System.out.print(" "+j+". JavaCAN");
            j++;
        }
        System.out.println();
        int başlan=0;
        while(başlan<100){
            if(başlan%2==1){
                System.out.print(başlan+" ");
            }
            başlan++;
        }
        Scanner input=new Scanner (System.in);
        System.out.println("Ağam bir ifade giriniz");
        String str=input.nextLine();
        String tersstring="";
        for (int k = str.length()-1; k >= 0; k--) {
            tersstring += str.charAt(k);


        }
        System.out.println(tersstring);
        String tersstring1="";

        int strUzunluk=str.length();
        while (strUzunluk >=1){
            tersstring1+=str.charAt(strUzunluk-1);
            strUzunluk--;

        }
        System.out.println(tersstring1);
    }
}
