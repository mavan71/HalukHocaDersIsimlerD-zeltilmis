package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDeneme {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println("bugun = " + bugun);
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getChronology() = " + bugun.getChronology());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getEra() = " + bugun.getEra());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        LocalTime suAn= LocalTime.now();
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Los_angles " +zdt);
        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New_York " +zdt1);
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Paris " +zdt2);
        ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Istanbul " +zdt3);


    }
}
