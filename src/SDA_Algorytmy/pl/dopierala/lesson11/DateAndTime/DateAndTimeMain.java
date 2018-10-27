package SDA_Algorytmy.pl.dopierala.lesson11.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeMain {
    public static void main(String[] args) {
        LocalDateTime actualDate = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime accident = LocalDateTime.parse("21-05-2017 09:25",formater);

        System.out.println("Dzisiaj mamy:"+actualDate.format(formater));
        System.out.println("Wypadek miałem :"+ accident.format(formater));

        System.out.println("To było "+Duration.between(accident,actualDate).toDays()+" dni temu.");

    }
}
