package Deneme111;

import java.util.Arrays;
import java.util.Scanner;

public class DenemeArray {
    public static void main(String[] args) {
        int a;
        int b[];
        String isimArr[] = {"Ahmet", "Mehmet", "Muhammed", "Mustafa"};
        int Arr[] = new int[5];
        Arr[1] = 25;
        Arr[2] = 24;

        Arr[4] = 56;
        Arr[0] = 12;
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 25, 24, 34, 56]
        Arrays.sort(Arr);
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 24, 25, 34, 56]
        System.out.println(Arr);//[I@26ba2a48
        System.out.println(Arr + " ");//[I@26ba2a48
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");//12 24 25 34 56
//
        }
        System.out.println();
        for (int i = 0; i <=Arr.length-1 ; i++) {
            if(Arr[i]%2==0){
                System.out.print(Arr[i]+" ");//12 24 34 56
            }
//
      //  }
      //  for (int i = 0; i <isimArr.length ; i++) {
      //      if(isimArr[i].length()>5){
      //          System.out.print(isimArr[i]+" ");
      //      }
      //  }        //Task-> isimArray de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz
      //  int yeniArrBoyut=0;
      //  for (int i = 0; i <isimArr.length-1 ; i++) {
      //      if(isimArr[i].length()<6){
      //          yeniArrBoyut++;
//
      //      }
//
      //  }String yeniArr[]=new String [yeniArrBoyut];
      //      int j=0;
      //  for (int i = 0; i < isimArr.length ; i++) {
      //      if(isimArr[i].length()<6) {
//
      //          yeniArr[j] = isimArr[i];
      //          j++;
      //      }
      //  }
      //  // array'de eleman kontrolu
        int Arr1[]={2, 46, 31, 80, 44, 63, 27, 21, 79};

        int sayi1 =44;
        int sayi2=32;

        boolean flag=false;

        for (int k = 0; k < Arr1.length-1; k++) {
            if (Arr1[k]==sayi2) {
            flag=true;
           break;
            }
        }
        if(flag){
            System.out.println("sayı Mevcut ");

        }else System.out.println("Sayi mevcut değil");
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//[2, 46, 31, 80, 44, 63, 27, 21, 79]
        Arrays.sort(Arr);
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//[2, 21, 27, 31, 44, 46, 63, 79, 80]
        System.out.println("Arrays.binarySearch(Arr,44) = " + Arrays.binarySearch(Arr, 44));//4
        System.out.println("Arrays.binarySearch(Arr,32) = " + Arrays.binarySearch(Arr, 32));//-5
//String data Array' ecevirmek için ..split()-> girilen parametre değere göre string prçalanır

        String str="Ben Allah'ı ve Rasulu çok seviyorum";
        String strArr[]=str.split("");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));//[B, e, n,  , A, l, l, a, h, ', ı,  , v, e,  , R, a, s, u, l, u,  , ç, o, k,  , s, e, v, i, y, o, r,
        System.out.println("strArr.length = " + strArr.length);//35
        String strArr1[]=str.split(" ");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr1));//[Ben, Allah'ı, ve, Rasulu, çok, seviyorum]
        System.out.println("strArr1.length = " + strArr1.length);//6

        int arr1[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr2[] = {21, 27, 46, 79, 44, 2, 1, 80};
        System.out.println("Arrays.equals(arr1, arr2) = " + Arrays.equals(arr1, arr2));//false
        System.out.println("arr1[0]==arr2[6] = " + (arr1[0] == arr2[6]));//true
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arrays.equals(arr1, arr2) = " + Arrays.equals(arr1, arr2));//true

        //Array'yi string'e convert(cevirme)...
        String str1=Arrays.toString(arr1);//arr1 int array String data type cevirildi
        System.out.println("str1 "+str1);//str1 [1, 2, 21, 27, 44, 46, 79, 80]
        System.out.println("str1.substring(3) = " + str1.substring(3));//2, 21, 27, 44, 46, 79, 80]
        /*
            Not://[1, 2, 21, 27, 44, 46, 79, 80]
             [=0.index
                1=1.index
                ,=2.index
                    2=3.index
                3. indexden itibaren 2, 21, 27, 44, 46, 79, 80]
                                                             */
        System.out.println("str1.substring(6) = " + str1.substring(6));// 21, 27, 44, 46, 79, 80]
        System.out.println("str1.substring(7) = " + str1.substring(7));//21, 27, 44, 46, 79, 80]
        System.out.println("str1.substring(8) = " + str1.substring(8));//1, 27, 44, 46, 79, 80]

        //Array kopyalama...copyOf();->girilen arr'in newLength ekadar ilk elemanını kopyalar
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//[2, 21, 27, 31, 44, 46, 63, 79, 80]
        int [] Arr2=Arrays.copyOf(Arr,3);//Arr nin ilk 3 elemamanını al Arr1 dizisi yap
        System.out.println("Arrays.toString(Arr1) = " + Arrays.toString(Arr1));//[2, 21, 27]
        //task-> arr'nin son  3 elemanını atandığı arrayi print eden code create ediniz.
       int Arr3[]= Arrays.copyOfRange(Arr,Arr.length-3,Arr.length);
        System.out.println("Arr3 = " + Arr3);//Arr3 = [I@77b52d12
        System.out.println("Arrays.toString(Arr3) = " + Arrays.toString(Arr3));//Arrays.toString(Arr3) = [63, 79, 80]
        Arrays.fill(Arr3,23);
        System.out.println("Arrays.toString(Arr3) = " + Arrays.toString(Arr3));//Arrays.toString(Arr3) = [23, 23, 23]
        Arrays.fill(Arr3, Arr3.length-2,Arr3.length,71);
        System.out.println("Arrays.toString(Arr3) = " + Arrays.toString(Arr3));//[23, 71, 71]

        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Kaç sayı girecen ");
        int arrBoyut=input.nextInt();
        int Arr5[]=new int [arrBoyut];
        for (int l = 0; l <arrBoyut ; l++) {
            System.out.println("Ağam " +i+" indexi gir. ");
            Arr5[l]=input.nextInt();

        }
        System.out.println("Arrays.toString(Arr5) = " + Arrays.toString(Arr5));//Arrays.toString(Arr5) = [23, 67, 12, 89]
        Arrays.sort(Arr5);
        System.out.println("Arrays.toString(Arr5) = " + Arrays.toString(Arr5));//Arrays.toString(Arr5) = [12, 23, 67, 89]
        int Arr6[]=new int[arrBoyut] ;
        for (int m =Arr5.length-1; m >=0 ; m--) {
            Arr6[m]=Arr5[m];
            System.out.print(Arr6[m]+" ");//89 56 23 12

        }
        System.out.println("Arrays.toString(Arr6) = " + Arrays.toString(Arr6));//Arrays.toString(Arr6) = [12, 23, 56, 89]
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
       // Scanner input=new Scanner(System.in);
        System.out.println("Ağam Kaç sayı girecen ");
        int arrBoyut1=input.nextInt();
        int Arr7[]=new int [arrBoyut1];
        for (int p = 0; p <arrBoyut1 ; p++) {
            System.out.println("Ağam " +p+" indexi gir. ");
            Arr7[p]=input.nextInt();

        }
        int toplam=0;
        for (int r = 0; r <Arr7.length; r++) {
            toplam+=Arr7[r];
        }
        System.out.println("toplam = " +toplam);
    }
        String str[]=new String[3];
        str[1] = "toyota";
        str[2] = "audi";

        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 25, 24, 34, 56]
        Arrays.sort(Arr);
        System.out.println("Arrays.toString(Arr) = " + Arrays.toString(Arr));//Arrays.toString(Arr) = [12, 24, 25, 34, 56]
        System.out.println(Arr);//[I@26ba2a48

}}


