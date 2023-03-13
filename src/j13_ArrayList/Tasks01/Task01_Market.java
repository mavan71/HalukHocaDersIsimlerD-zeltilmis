package j13_ArrayList.Tasks01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task01_Market {
    static Scanner scan=new Scanner(System.in);
    static double ortalama;
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {


        ArrayList<String>haftaninGunleri =new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));

        ArrayList<Integer>gunlukKazanc=new ArrayList<>();
         int gun=1;
         while(gun<=7){
             System.out.println("haftanin "+gun+". gunu kazancini giriniz" );
             gunlukKazanc.add(scan.nextInt());

             gun++;
         }
        System.out.println(gunlukKazanc);


        getOrtalamaKazanc(gunlukKazanc);
        System.out.println("Haftalık Ortalama Kazanc = " + getOrtalamaKazanc(gunlukKazanc));


        getOrtalamaninUstundeKazancGünleri(haftaninGunleri,gunlukKazanc, ortalama);
        System.out.println("Haftalık Ortalama Ustu Gunler :" +getOrtalamaninUstundeKazancGünleri(haftaninGunleri,gunlukKazanc, ortalama));

        getOrtalamaninAltiKazancGünleri(haftaninGunleri,gunlukKazanc, ortalama);
        System.out.println("Haftalık Ortalama Altı Gunler :"+getOrtalamaninAltiKazancGünleri(haftaninGunleri,gunlukKazanc, ortalama));

        getOrtalamaKazancınOlduguGünler(haftaninGunleri,gunlukKazanc, ortalama);
        System.out.println("Haftalık Ortalamaya Eşit Gunler :"+getOrtalamaKazancınOlduguGünler(haftaninGunleri,gunlukKazanc, ortalama));
    }//Main Sonu



    public static double  getOrtalamaKazanc(ArrayList<Integer>list  ){
        int topla=0;
        for (int i = 0; i <list.size(); i++) {
            topla+=list.get(i);

        }
        ortalama=topla/list.size();
        return ortalama;

    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGünleri(ArrayList<String>haftaninGunleri,ArrayList<Integer>gunlukKazanc, double ortalama) {
        
        ArrayList<String>OrtalamaninUstundeGünleri=new ArrayList<String>();

                for (int i = 0; i <haftaninGunleri.size(); i++) {
                    if(gunlukKazanc.get(i)>ortalama){
                        OrtalamaninUstundeGünleri.add(haftaninGunleri.get(i));
                    }
            
        }
        return OrtalamaninUstundeGünleri;
    }
    private static ArrayList<String> getOrtalamaninAltiKazancGünleri(ArrayList<String> haftaninGunleri, ArrayList<Integer> gunlukKazanc, double ortalama) {
        ArrayList<String>OrtalamaninAltıGünleri=new ArrayList<String>();

        for (int i = 0; i <haftaninGunleri.size(); i++) {
            if(gunlukKazanc.get(i)<ortalama){
                OrtalamaninAltıGünleri.add(haftaninGunleri.get(i));
            }

        }
        return OrtalamaninAltıGünleri;


    }
    private static ArrayList<String> getOrtalamaKazancınOlduguGünler(ArrayList<String> haftaninGunleri, ArrayList<Integer> gunlukKazanc, double ortalama) {

        ArrayList<String>OrtalamayaEsitGünler=new ArrayList<String>();

        for (int i = 0; i <haftaninGunleri.size(); i++) {
            if(gunlukKazanc.get(i)==ortalama){
                OrtalamayaEsitGünler.add(haftaninGunleri.get(i));
            }

        }
        return OrtalamayaEsitGünler;


    }

}//Class Sonu
