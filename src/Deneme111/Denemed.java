package Deneme111;

public class Denemed {

    //Type a method to check if an int Array is symmetrical or not.
    //1. yöntem
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 2, 51};

        System.out.println("symetrical(arr) = " + symetrical(arr));
        // 2. yöntem

        //Type a method to check if an int Array is symmetrical or not.

        int arr1[] = {1, 2, 3, 4, 4, 3, 2, 51};
        String dizininBasi = "";
        String dizininSonu = "";

        for (int i = 0; i < arr1.length / 2; i++) {
            dizininBasi += String.valueOf(arr1[i]);
        }
        for (int i = arr1.length - 1; i >= arr1.length / 2; i--) {
            dizininSonu += String.valueOf(arr1[i]);
        }
        if (dizininBasi.equals(dizininSonu)) {
            System.out.println("simetriktir");
        } else {
            System.out.println("simetrik değildir");
        }



    }

    private static boolean symetrical(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                flag = true;
            }break;
        }
        return flag;


    }
}
