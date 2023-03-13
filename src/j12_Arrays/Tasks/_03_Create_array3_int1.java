package j12_Arrays.Tasks;

public class _03_Create_array3_int1 {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        int toplam=0;
        int sayiArr[]={25,30,30,35,100};
        for (int i = 0; i < sayiArr.length ; i++) {
            toplam+=sayiArr[i];

        }
        System.out.println(toplam);
    }
}