package classwork_35;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

//        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**
public class TimeApiAppl {
    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();
        System.out.println(currentDay); // international format of Date ISO
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println("------------------------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("--------------------------");

        // - есть дата, какой это был день недели? день месяца? день года?
        LocalDate gagarinStart = LocalDate.of(1961, 04, 12);
        System.out.println(gagarinStart.getYear());
        System.out.println(gagarinStart.getDayOfYear());
        System.out.println(gagarinStart.getDayOfWeek());

        System.out.println("----------------------");
        System.out.println(gagarinStart.isAfter(currentDay)); // false
        System.out.println(gagarinStart.isBefore(currentDay)); // true

        System.out.println("-----------+ 50 days--------------");
        LocalDate newDate = currentDay.plusDays(50);
        System.out.println(newDate);

        System.out.println("-------------- + 12 weeks --------------------");
        newDate = currentDay.plusWeeks(12);
        System.out.println(newDate);

        System.out.println("--------------- - 2 months -------------------");
        newDate = currentDay.minusMonths(2);
        System.out.println(newDate);

        System.out.println("---------------------------------------");
        // using ChronoUnit
        LocalDateTime newDayTime = localDateTime.plus(9, ChronoUnit.HALF_DAYS);
        System.out.println(newDayTime);

        System.out.println("========================================");
        newDate = currentDay.plus(2, ChronoUnit.CENTURIES);
        System.out.println(newDate.getDayOfWeek());

        System.out.println("---------------------------");
        LocalDate einstein = LocalDate.of(1879, 3, 14);
        System.out.println(einstein);
        long res = ChronoUnit.YEARS.between(gagarinStart, einstein);
        System.out.println(res);

        System.out.println("------------Compare dates------------------");
        System.out.println(einstein.compareTo(gagarinStart));

        System.out.println("-------------Sorting array with time--------");

        LocalDate yesterday = LocalDate.of(2024, 06,06);
        LocalDate[] dates = {currentDay, gagarinStart, einstein, yesterday};
        System.out.println(Arrays.toString(dates)); // print as it is
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates)); // print after sorting
    }
}
