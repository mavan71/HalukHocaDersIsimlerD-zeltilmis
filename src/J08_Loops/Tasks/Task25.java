package J08_Loops.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  ://tekrarlı karakterleri bir kez yazınız
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ağam bir string gir");
        String str=input.nextLine();//aabbbccccddddddaaa

String cikti= "";

        for (int i=0; i<=str.length()-1 ; i++) {
            if(!cikti.contains(str.substring(i,i+1))){//str den ardışık parça çıktıda yoksa şartı
                //kutuda yokds               0 dahil 1 haric
                cikti=str.substring(i,i+1);//kutuda olmayan elaman kutuya eklendi
                        }
        }
        System.out.println("cikti :" +cikti);
    }

}
