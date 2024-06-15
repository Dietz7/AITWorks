package homework_36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormatY {
    public static void main(String[] args) {

        LocalDate yBorn = LocalDate.of(1984, 06, 28);
        System.out.println(yBorn);

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(yBorn.format(df));

        System.out.println("-------------------------------------");
        df = DateTimeFormatter.ofPattern("dd MMMM yy", Locale.ENGLISH);
        System.out.println(yBorn.format(df));

        System.out.println("=====================parsing date from string=================");
        String str = "28 06 1984";
        System.out.println(str);

        System.out.println("----------------------------------------------------");
        LocalDate date = dateParse(str);
        // System.out.println(date);
        System.out.print(date + " " + date.getDayOfWeek());

    }

    // this method extracts the date in ISO format from the string by text format
    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd MM " + "yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy]");
        return LocalDate.parse(date, df);
    }
}

