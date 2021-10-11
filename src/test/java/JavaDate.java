import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class JavaDate {

    public static void main(String[] args) {

      /*  ZoneId z = ZoneId.of("Australia/Sydney");
        LocalTime lt = LocalTime.now(z);
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
*/



        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
        ZoneId z = ZoneId.of("Australia/Sydney");
            LocalDate ld = LocalDate.now(z);

        System.out.println(ld.getYear());
        System.out.println(ld.plusDays(2));
    }
}
