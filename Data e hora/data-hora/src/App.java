import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Data-Hora\n");

        // INSTANCIAÇÕES:

        LocalDate d01 = LocalDate.now(); // data local agora
        LocalDateTime d02 = LocalDateTime.now(); // data e hora local agora
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-06-21"); // padrão ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T20:30:10");

        Instant d06 = Instant.parse("2023-06-21T18:22:00Z"); // horário de londres
        Instant d07 = Instant.parse("2023-06-21T18:22:00-04:00"); // lond convert p df
        Instant d72 = Instant.parse("2023-06-21T18:22:00+04:00"); // df convert p lond

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate d08 = LocalDate.parse("21/06/2023", formato1);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: Horas do DF convertida para Londres: " + d07);
        System.out.println("d07: Horas de Lond convertida para DF: " + d72);
        System.out.println("d08: " + d08);

        // outra forma
        LocalDate d09 = LocalDate.of(2023, 04, 03);
        System.out.println("d09: " + d09);
        LocalDateTime d10 = LocalDateTime.of(2002, 03, 04, 12, 0, 10);
        System.out.println("d10: " + d10);

        // CONVERSÕES

        LocalDateTime d11 = LocalDateTime.parse("2023-06-22T01:00:00");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter formatoISO = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d11 costumizado = " + formato2.format(d11)); // imprimindo de acordo com o formato
        System.out.println("d11 ISO = " + formatoISO.format(d11));

        Instant d12 = Instant.parse("2023-06-22T19:04:00z");
        // criando um formato qur suporte outro fuso-horário
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d12 = " + formato3.format(d12));

    }
}
