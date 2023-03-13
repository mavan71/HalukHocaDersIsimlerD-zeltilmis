package J08_Loops.Tasks;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */
        for (int kat = 1; kat <= 3; kat++) {
            System.out.println("IT: " + kat);
            for (int daire = 1; daire <= 3; daire++) {
                System.out.println("  QA: " + daire);

            }
        }System.out.println("....");


    }
}
