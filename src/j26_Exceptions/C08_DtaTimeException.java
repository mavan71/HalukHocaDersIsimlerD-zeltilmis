package j26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DtaTimeException {
    public static void main(String[] args) {

        //LocalDate d1=LocalDate.of(2023,2,29);
try {
    LocalDate d1=LocalDate.of(2023,2,29);
    System.out.println("Hatalı Girdi Yaptın");
    System.out.println("Hata fırlattı ama hallettik");
}catch (DateTimeException e) {

        }
    }

}
