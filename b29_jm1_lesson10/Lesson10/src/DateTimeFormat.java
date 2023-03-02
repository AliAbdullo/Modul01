import java.util.Date;
import java.util.Locale;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(String.format(Locale.US,"%tA", d));
        System.out.println(String.format("%tc", d));
        System.out.println(String.format(Locale.ENGLISH,"%tc", d));
        System.out.println(String.format("%tH", d));
        System.out.println(String.format("%tm", d));
        System.out.println(String.format("%tQ", d));
        System.out.println(String.format("%tY", d));
        System.out.println(String.format("%ta", d));
        System.out.println(String.format("%tB", d));
        System.out.println(String.format("%tb", d));
        System.out.println(String.format("%tC", d));
        System.out.println(String.format("%tD", d));
        System.out.println(String.format("%te", d));
        System.out.println(String.format("%tF", d));
        System.out.println(String.format("%tI", d));
        System.out.println(String.format("%tj", d));
        System.out.println(String.format("%tk", d));
        System.out.println(String.format("%tl", d));
        System.out.println(String.format("%tM", d));
        System.out.println(String.format("%tN", d));
        System.out.println(String.format("%tp", d));
        System.out.println(String.format("%tR", d));
        System.out.println(String.format("%tr", d));
        System.out.println(String.format("%tS", d));
        System.out.println(String.format("%tT", d));
        System.out.println(String.format("%tz", d));
        System.out.println(String.format("%tZ", d));
        System.out.println(String.format("%ty", d));
//        System.out.println(String.format("%tt", d));
    }
}
