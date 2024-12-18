package academy.devdojo.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortsID = ZoneId.SHORT_IDS;
        System.out.println(shortsID);
        System.out.println(ZoneId.systemDefault()); // Minha zona de horário
        ZoneId zonaToyko = ZoneId.of("America/Puerto_Rico");
        ZoneId zonaAsia = ZoneId.of("Africa/Cairo");
        System.out.println(zonaToyko);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonaIdToyko = now.atZone(zonaToyko);
        System.out.println(zonaIdToyko);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = Instant.now().atZone(zonaToyko);
        ZonedDateTime zonaDateTimeAtAfrica = Instant.now().atZone(zonaAsia);
        System.out.println(zonedDateTime);
        System.out.println(zonaDateTimeAtAfrica);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime instantNowManaus = Instant.now().atOffset(zoneOffsetManaus);
        System.out.println(instantNowManaus);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate1 = JapaneseDate.from(meijiEraLocalDate);

        System.out.println(japaneseDate1);
    }
}
