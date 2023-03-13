package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {

        ArrayList<Integer>list1 =new ArrayList<>(List.of(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));

        rangeBtw(list1,5,30);
        //System.out.println(rangeBtw(list1,5,30));




    }//Main Sonu

    private static void rangeBtw(ArrayList<Integer> list1, int min, int max) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        if (list1.contains(min)&&list1.contains(max)){

            for (int i = 0; i < list1.size(); i++) {

                if(min<=list1.get(i) && list1.get(i)<=max){
                    list2.add(list1.get(i));
                }

            }

        } System.out.println("girilen Rakamlar Max ve min değerlerini İçermiyor. Yeniden Deneyiniz");
        int caunt =list1.size();
        System.out.println(caunt);
        System.out.println(list1);





    }


}//Class Sonu