import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println(SummerSolsticeCountdown.getSummerSolsticeCountdown());
        System.out.println(WinterSolsticeCountdown.getWinterSolsticeCountdown());

    }
}
