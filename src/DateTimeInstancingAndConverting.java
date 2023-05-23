import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeInstancingAndConverting {
    public static void main(String[] args) {

        // Creating different instances of DateTime
        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Instant instantNow = Instant.now();

        // Converting a TextDate to different instances of DateTime
        LocalDate localDateParse = LocalDate.parse("2023-05-19");
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2023-05-19T16:04:25");
        Instant instantParseZulu = Instant.parse("2023-05-19T16:09:25Z");
        Instant instantParseWithGMT = Instant.parse("2023-05-19T16:10:25-03:00");

        // Creating some DateTimeFormatter objects to modify the DateTime output
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dateTimeFormatterGMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Printing out console
        System.out.println("LocalDateNow: " + localDateNow);
        System.out.println("LocalDateTimeNow: " + localDateTimeNow);
        System.out.println("InstantNow: " + instantNow);
        System.out.println("LocalDateParse: " + localDateParse);
        System.out.println("LocalDateTimeParse: " + localDateTimeParse);
        System.out.println("InstantParseZulu: " + instantParseZulu);
        System.out.println("InstantParseWithGMT: " + instantParseWithGMT);
        System.out.println("LocalDateNow with dateFormatter pattern: " + dateFormatter.format(localDateNow));
        System.out.println("LocalDatetimeNow with dateTimeFormatter pattern: " + localDateTimeNow.format(dateTimeFormatter));
        System.out.println("InstantNow with dateTimeformatterGMT pattern: " + dateTimeFormatterGMT.format(instantNow));
    }
}