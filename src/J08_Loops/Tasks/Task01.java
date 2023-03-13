package J08_Loops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/Scanner sc=new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int sayi=sc.nextInt();
        if(sayi<100 &&sayi>0){
            if(sayi%3==0||sayi%5==0){
                for(int i=1;i<=sayi;i++){
                    if(sayi%15==0){
                        System.out.println("JavaCAN");
                    }else if(sayi%5==0){
                        System.out.println("CAN'dır");
                    }else if(sayi%3==0){
                        System.out.println("Java");
                    }
                }


            }else System.out.println("Girdiğiniz sayı 3 ün 5 in katı olsun");

        }else System.out.println("100 den küçük bir tamsayı giriniz");


    }
}
