package J08_Loops.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Bir sayı gir");
        int sayi =input.nextInt();
int bolenSayisi=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
               bolenSayisi++;

            }
        }
if(bolenSayisi==0)
    {
        System.out.println("girilen sayi asal dir");

}else System.out.println("girilen sayi asal değildir");


    }
}
