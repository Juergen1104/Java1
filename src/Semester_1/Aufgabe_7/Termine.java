package Semester_1.Aufgabe_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Termine {

  /*  ***  Aufgabenteil (a) *** */
  // 3P
  public static LocalDateTime[] termineMoDo(LocalDate d) {

    LocalDateTime[] termine = new LocalDateTime[28];
    Locale loc = Locale.GERMANY;

    long counter = 1;
    LocalDate nextMonday;
    LocalDate nextThusday;

    do {
      nextMonday = d.plusDays(counter);
      counter++;
    } while (nextMonday.getDayOfWeek().ordinal() != 0);

    nextThusday = nextMonday.plusDays(3);

    for (int i = 0; i < 27; i = i + 2) {

      if (i == 0) {
        termine[i] = nextMonday.atTime(10, 15, 0);
        termine[i + 1] = nextThusday.atTime(15, 30, 0);
        continue;
      }
      termine[i] = termine[i - 2].plusDays(7);
      termine[i + 1] = termine[i - 1].plusDays(7);
    }

    return termine;
  }

  /*  ***  Aufgabenteil (b) *** */
  // 2P
  public static void printDates(LocalDateTime[] termine) {

    DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("de"));

    for (LocalDateTime termin : termine) {

      System.out.println(termin.format(formatter));
    }
  }

  public static void main(String[] args) {
    LocalDate stichtag = LocalDate.of(2022, 8, 30);
    LocalDateTime[] termine = termineMoDo(stichtag);
    printDates(termine);
  }
}
