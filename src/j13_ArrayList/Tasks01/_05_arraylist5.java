package j13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
    ArrayList<String>eyaletler=new ArrayList(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println("Eyaletler" +eyaletler);
        rotateList(eyaletler);
        System.out.println("Eyaletler Testen Yazıldı: "+rotateList(eyaletler));


    }//Main sonu

    private static ArrayList<String> rotateList(ArrayList<String> eyaletler) {

        ArrayList<String>eyaletlerRotated=new ArrayList<>();
        for (int i = eyaletler.size()-1; i >=0 ; i--) {
            eyaletlerRotated.add(eyaletler.get(i));

        }


        return eyaletlerRotated;
    }


}//Class sonu

