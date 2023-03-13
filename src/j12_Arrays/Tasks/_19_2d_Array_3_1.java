package j12_Arrays.Tasks;
import java.util.Arrays;

public class _19_2d_Array_3_1 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String cityArr [][] = {{"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};

        System.out.println("Arrays.deepToString(cityArr) = " + Arrays.deepToString(cityArr));

        for (int i = 0; i < cityArr.length; i++) {
            for (int j = 0; j < cityArr[i].length; j++) {
                if (cityArr[i][j].equals("ohio")) {
                    cityArr[i][j]= "Florida";
                }

            }
        }
        System.out.println("Arrays.deepToString(cityArr) = " + Arrays.deepToString(cityArr));
     // for (int i = 0; i < cityArr.length ; i++) {
     //     for (int j = 0; j <cityArr[i].length ; j++) {
     //         System.out.print(cityArr[i][j]+" ");
     //     }

     // }


    }
}

