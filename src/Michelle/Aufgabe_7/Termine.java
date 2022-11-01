package Michelle.Aufgabe_7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Termine {

    /*  ***  Aufgabenteil (a) *** */
    // 3P
    public static LocalDateTime[] termineMoDo (LocalDate d) {

        return null;    // Dummy return
    }

    /*  ***  Aufgabenteil (b) *** */
    // 2P
    public static void printDates(LocalDateTime[] termine) {

    }

    public static void main(String[] args) {
        LocalDate stichtag = LocalDate.of(2022,8,31);
        LocalDateTime[] termine = termineMoDo(stichtag);
        printDates(termine);
    }

}
