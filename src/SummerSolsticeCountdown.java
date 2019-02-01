import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SummerSolsticeCountdown {
    static String getSummerSolsticeCountdown() {
        LocalDateTime jetzt = LocalDateTime.now();
        String zweitausendeins = "2001-06-06 07:38";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime anfang = LocalDateTime.parse(zweitausendeins, formatter);
        LocalDateTime irgendwas = anfang;
        while (irgendwas.isAfter(jetzt) == false) {
            irgendwas = irgendwas.plus(31556926, ChronoUnit.SECONDS);
        }
        Duration timeTilSummerSolstice = Duration.between(jetzt, irgendwas);
        return "Noch " +
                timeTilSummerSolstice.toDays() + " Tage bis zur nächsten Sommersonnenwende.";
    }
}