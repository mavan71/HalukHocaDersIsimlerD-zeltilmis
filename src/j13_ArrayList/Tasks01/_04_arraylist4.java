package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class _04_arraylist4 {
    static String s1="blue";
   static String s2="yellow";

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String>Renkler=new ArrayList<String>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        System.out.println(Renkler);
        changeInArraylist(Renkler,"blue","yellow");
        System.out.println(Renkler);
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String>Renkler, String s1,String s2) {
        for (int i = 0; i <Renkler.size(); i++) {
        if(Renkler.get(i).equals(s1)){
            Renkler.set(i,s2);
        }

        }

        return Renkler;
    }


}
