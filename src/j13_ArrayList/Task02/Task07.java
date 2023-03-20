package j13_ArrayList.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String>isimler=new ArrayList<>(List.of("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("isimler = " + isimler);
        String listin3Elamanı;
        listin3Elamanı=isimler.get(2);
        System.out.println("listin3Elamanı = " + listin3Elamanı);
        System.out.println("isimler = " + isimler);
        isimler.set(2,isimler.get(7));
        System.out.println("isimler = " + isimler);
        isimler.set(7,listin3Elamanı);
        System.out.println("isimler = " + isimler);
    }
}
