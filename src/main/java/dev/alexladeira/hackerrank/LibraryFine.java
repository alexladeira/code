package dev.alexladeira.hackerrank;

import java.time.LocalDate;
import java.time.Period;

public class LibraryFine {
    public static int fine(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate returned = LocalDate.of(y1, m1, d1);
        LocalDate due = LocalDate.of(y2, m2, d2);

        Period period = Period.between(due, returned);
        if (period.getYears() > 0 || y1 - y2 > 0) {
            return 10_000;
        } else if (period.getMonths() > 0) {
            int months = period.getMonths();
            if (period.getDays() > 0 && period.getDays() >= 12) {
                months++;
            }
            return 500 * months;
        } else if (period.getDays() > 0) {
            return 15 * period.getDays();
        } else {
            return 0;
        }
    }
}
