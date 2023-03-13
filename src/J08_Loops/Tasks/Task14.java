package J08_Loops.Tasks;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.
        System.out.println("******1.yol*********");
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("******2.yol*********");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }

        }
    }}
