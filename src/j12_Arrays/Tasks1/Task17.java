package j12_Arrays.Tasks1;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        System.out.println("***************1. yontem **********");
        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        };


        int max=arr3[0][0];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if(arr3[i][j]>max){
                    max=arr3[i][j];
                }
            }
        }
        System.out.println("arr3 ün enbüyük elemanı :" +max);


    }
}
