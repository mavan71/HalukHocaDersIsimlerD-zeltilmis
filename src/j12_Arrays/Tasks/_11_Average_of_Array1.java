package j12_Arrays.Tasks;

public class _11_Average_of_Array1 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int sayiArr[]={12, 14 , 21 ,23 , 10 ,4};
        double topla=0;
        for (int i = 0; i <sayiArr.length ; i++) {
            topla+=sayiArr[i];


        }
        System.out.println(" Array'in ortalaması "+(topla/sayiArr.length));
    }
}