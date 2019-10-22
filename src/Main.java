import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 02, 1);
        Month miesiac = date.getMonth();
        int liczbaDni = miesiac.length(date.isLeapYear());
        DayOfWeek dayOfWeek = DayOfWeek.TUESDAY;
        int liczbaWtorkow = 0;
        for (int i = 1; i < liczbaDni; i++) {
            if (date.getDayOfWeek().equals(dayOfWeek)) {
                liczbaWtorkow++;
            }
            date = date.plusDays(1);
        }
        System.out.println(liczbaWtorkow);
    }
}
