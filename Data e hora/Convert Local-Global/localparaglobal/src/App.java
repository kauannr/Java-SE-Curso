import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversão de horas\n");

        // Convertendo para outro fuso horario
        Instant dt2 = Instant.parse("2023-06-22T20:14:00Z");
        System.out.println("Data-Hora em londres: " + dt2);

        LocalDateTime dt3 = LocalDateTime.ofInstant(dt2, ZoneId.of("Portugal"));
        System.out.println(dt3);

        // Pegando valores
        LocalDateTime dt1 = LocalDateTime.parse("2023-06-22T16:14");
        System.out.println(dt1.getDayOfMonth());
        System.out.println(dt1.getMonth());
        System.out.println(dt1.getMonthValue());
        System.out.println(dt1.getYear());
        System.out.println(dt1.getDayOfWeek());
        System.out.println(dt1.getHour());
        System.out.println(dt1.getMinute());

    }
}
