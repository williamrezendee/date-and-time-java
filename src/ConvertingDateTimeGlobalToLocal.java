import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertingDateTimeGlobalToLocal {
    public static void main(String[] args) {

        // Creating different instances of DateTime
        LocalDate localDate = LocalDate.parse("2023-05-22");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-05-22T21:32:26");
        Instant instant = Instant.parse("2023-05-22T21:32:26Z");

        // Converting DateTime Global to Local
        LocalDate systemDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate portugalDate = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));
        LocalDateTime systemDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime portugalDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));


        // Printing out console
        System.out.println("SystemDate: " + systemDate);
        System.out.println("PortugalDate: " + portugalDate);
        System.out.println("SystemDateTime: " + systemDateTime);
        System.out.println("PortugalDateTime: " + portugalDateTime);
        System.out.println("LocalDate's day: " + localDate.getDayOfMonth());
        System.out.println("LocalDate's month: " + localDate.getMonth());
        System.out.println("LocalDate's year: " + localDate.getYear());
        System.out.println("LocalDateTime's hour: " + localDateTime.getHour());
        System.out.println("LocalDateTime's minute: " + localDateTime.getMinute());
    }
}
