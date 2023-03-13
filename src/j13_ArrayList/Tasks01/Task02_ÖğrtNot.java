package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Scanner;



public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.


         */
        Scanner scan=new Scanner(System.in);
       int not=0;
        ArrayList<Integer>notList=new ArrayList<>();

        while(not<=100){//100 e kadar notları giriniz

            System.out.println("Not Giriniz Çıkmak içinde 100 den büyük bir sayi giriniz");
            notList.add(not=scan.nextInt());

        }
       notList.remove(notList.size()-1);//Listin son elamanı olan 101 i sildik
        System.out.println(notList);
        int toplam=0;
        for (int i = 0; i < notList.size(); i++) {
            toplam +=notList.get(i);
        }
        int ortalama=toplam/notList.size();
        System.out.println("ortalama =" +ortalama);

        ArrayList<Integer>ortalamaUstu=new ArrayList<Integer>();
        for (int i = 0; i < notList.size(); i++) {
            if(notList.get(i)>=ortalama){
                ortalamaUstu.add(notList.get(i));
            }
        }
        System.out.println("ortalamaUstu = " + ortalamaUstu);
        System.out.println("ortalamaUstu eleman sayısı " +ortalamaUstu.size());


    }

    }

