package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
    int a=0;
    int b=1;
    ArrayList<Integer>fibonacciList=new ArrayList<>();
    fibonacciList.add(a);
    fibonacciList.add(b);
        System.out.println("list = " + fibonacciList);
    Scanner input=new Scanner(System.in);
        System.out.println("Ağam Hangi sayiya kadar fibonocci dizisini oluşturmamı istiyorsun");
        int sayi=input.nextInt();
        for (int i = 0; i < fibonacciList.size()-1; i++) {

            int yeniSayi=fibonacciList.get(i)+fibonacciList.get(i+1);

            if(yeniSayi>sayi){
                break;
            }
            fibonacciList.add(yeniSayi);
        }


        System.out.println("list = " + fibonacciList);
        
             

    }
}
