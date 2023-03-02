import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SFExample4 {
    public static void main(String[] args) {
        // Datetime Format
        Date date = new Date();

        System.out.println(date);
        System.out.println(date.toString());

        // DateFormat, SimpleDateFormat

        DateFormat dateFormat = new SimpleDateFormat("'bugungi kun: 'dd.MM.yyyy");
        System.out.println("Must: "+dateFormat.format(date));

        System.out.println();

        // Java Time API
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localDate.toString());

        // DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Must: "+localDate.format(dateTimeFormatter));
    }
}
