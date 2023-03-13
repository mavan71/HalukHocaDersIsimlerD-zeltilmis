package J08_Loops.Loop01_FoorLoop;

public class C03_NestedLoop {
    public static void main(String[] args) {

        /*
        bir loop body de {loop } tanımlanmasıyla olusan code
        bloguna nested loop denir apt. daire döngüsü
        iç loop dış loop un her stepinde tekrar çalışır ayrıca en içteki loop
        bitmeden dış loop bitmez
         */
        for (int apt = 1; apt<=10; apt++) {
            for (int daire = 1; daire<6; daire++) {
                System.out.println("apt :" +apt+"+için daire" +daire);
            }

        }




    }

    }
