package j12_Arrays.Tasks;

public class _06_Array_contains1 {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        //Kodu aşağıya yazınız..

      String meyveArr[]={ "Apple" , "Orange" , "Banana" , "Pineapple"};
      boolean flag =false;
      for (int i = 0; i <meyveArr.length ; i++) {
          if(meyveArr[i]=="Apple"){
              flag=true;
              System.out.println(true);
              System.out.println("Aple içeriyor");
              break;
          }else {System.out.println(false);
              System.out.println("Apple içermiyor");
              break;
          }
      }
        System.out.println("*********ikinci Yöntem*********");
       //  }
         String MeyveArr[] = {"Apple", "Orange", "Banana", "Pineapple"};

        boolean flag2 = false;
        for (int i = 0; i < MeyveArr.length; i++) {
        if (MeyveArr[i].equals("Apple")) {
            System.out.println(flag2 = true); // bu deger bulundugunda sistem donguye devam ediyor
            break;
        } else {
            System.out.println(flag2 = false);
            break;// kodu kırmak icin
}
        }

}

}
