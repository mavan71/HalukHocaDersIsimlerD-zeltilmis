package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou

        tekrarsızPrintEt();


    }//main sonu

    private static void tekrarsızPrintEt() {

        System.out.print("bizim ooolan bişeyle gir bakennn : ");
        String str = input.nextLine();
        String tekrarsız="";
        for (int i = 0; i < str.length(); i++) {
            if (!tekrarsız.contains(""+str.charAt(i))) {//tekrarsızda strnin döngüden gelen harfi yoksa şartı
           // if (!tekrarsız.contains(str.substring(i, i + 1))) {//tekrarsızda strnin döngüden gelen harfi yoksa şartı
                tekrarsız+=""+str.charAt(i);
            }
        }

        System.out.println(tekrarsız);

    }
}
