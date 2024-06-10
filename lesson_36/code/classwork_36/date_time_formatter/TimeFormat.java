package classwork_36.date_time_formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormat {
    public static void main(String[] args) {

        LocalDate gagarinStart = LocalDate.of(1961, 04, 12);
        System.out.println(gagarinStart);

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarinStart.format(df));

        System.out.println("-------------------------------------");
        df = DateTimeFormatter.ofPattern("dd MMMM yy", Locale.ENGLISH);
        System.out.println(gagarinStart.format(df));

        System.out.println("=====================parsing date from string=================");
        String str = "10 06 2024";
        System.out.println(str);

        System.out.println("----------------------------------------------------");
        LocalDate date = dateParse(str); // this method must calls
       // System.out.println(date);
        System.out.print(date + " " + date.getDayOfWeek());

    }

    // this method extracts the date in ISO format from the string by text format
    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd MM " + "yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy]");
        return LocalDate.parse(date, df);
    }
}
