package dev.alexladeira.codility;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class VacationWeekCounter {
    VacationWeekCounter() {
    }

    public static int solution(int y, String a, String b, String w) {
        List<String> month = Arrays.asList("JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST",
                "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER");
        Calendar initialDate = Calendar.getInstance();
        initialDate.set(Calendar.YEAR, y);
        initialDate.set(Calendar.MONTH, month.indexOf(a.toUpperCase()));

        if (initialDate.get(Calendar.DAY_OF_WEEK) > Calendar.MONDAY) {
            initialDate.set(Calendar.WEEK_OF_MONTH, 2);
            initialDate.set(Calendar.DAY_OF_WEEK,
                    initialDate.get(Calendar.DAY_OF_WEEK) - (initialDate.get(Calendar.DAY_OF_WEEK) - Calendar.MONDAY));
        }

        Calendar finalDate = Calendar.getInstance();
        finalDate.set(Calendar.YEAR, y);
        finalDate.set(Calendar.MONTH, month.indexOf(b.toUpperCase()));
        finalDate.set(Calendar.DATE, finalDate.getActualMaximum(Calendar.DATE));

        return (int) ChronoUnit.WEEKS.between(
                LocalDateTime.ofInstant(Instant.ofEpochMilli(initialDate.getTime().getTime()), ZoneId.systemDefault()),
                LocalDateTime.ofInstant(Instant.ofEpochMilli(finalDate.getTime().getTime()), ZoneId.systemDefault()));

    }
}