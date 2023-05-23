import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcsWithDateTime {
    public static void main(String[] args) {

        // Creating different instances of DateTime
        LocalDate localDate = LocalDate.parse("2023-05-22");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-05-22T21:32:26");
        Instant instant = Instant.parse("2023-05-22T21:32:26Z");

        // Creating new LocalDate instances with incremented or decremented days
        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        LocalDate nextWeekLocalDate = localDate.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = localDateTime.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = localDateTime.plusWeeks(1);
        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);

        // Calculating the duration between two DateTime
        Duration durationLocalDate = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
        Duration durationLocalDateTime = Duration.between(pastWeekLocalDateTime, localDateTime);

        // Printing out console
        System.out.println("PastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("PastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("NextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("PastWeekInstant: " + pastWeekInstant);
        System.out.println("NextWeekInstant: " + nextWeekInstant);
        System.out.println("DurationLocalDate in days: " + durationLocalDate.toDays());
        System.out.println("DurationLocalDateTime in days: " + durationLocalDateTime.toDays());
    }
}
