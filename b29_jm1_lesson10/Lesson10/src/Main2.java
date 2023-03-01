import java.io.IOException;
import java.util.Date;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        Date date = new Date();
 /*       System.out.printf("%tH  ",date);
        System.out.printf("%tM  ",date);
        System.out.printf("%tS  %n",date);
        System.out.printf("%tH:%<tM:%<tS:%<tL %n", date);
        System.out.printf("%tH:%<tM:%<tS %<tp %n", date);
        System.out.printf("%ts %n", date);*/

/*
        System.out.printf(Locale.ENGLISH,"%tB %n", date);
        System.out.printf(Locale.ENGLISH,"%tB/%<ta %n", date);
        System.out.printf(Locale.US,"%tB/%<tA %n", date);
        System.out.printf(Locale.US,"%tB/%<Ta %n", date);
        System.out.printf(Locale.US,"%ty %n", date);
        System.out.printf(Locale.US,"%tj %n", date);
        System.out.printf(Locale.US,"%tm %n", date);
        System.out.printf(Locale.US,"%td %n", date);
        System.out.printf(Locale.US,"%te %n", date);
        System.out.printf(Locale.US,"%td/%<tm/%<tY %n", date);
        System.out.printf(Locale.US,"%td-%<tm-%<tY %n", date);
        System.out.printf(Locale.US,"%td-%<tm-%<tY %<tH:%<tM:%<tS%n", date);
*/

/*        System.out.printf("%tR %n",date);
        System.out.printf("%tT %n",date);
        System.out.printf("%tT %<tp %n",date);
        System.out.printf("%tr %n",date);
        System.out.printf("%tD %n",date);
        System.out.printf("%tF %n",date);
        System.out.printf(Locale.ENGLISH,"%tc %n",date);*/

/*        System.out.printf("%s %n",234);
        System.out.printf("%s %n","houihoui");*/

        Book book = new Book();
        System.out.printf("%60s %n", book);


    }
}

class Book implements Formattable {

    private String title = "Atom odatlar";
    private String author = "Jeyms Klir";

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        try {
            Appendable appendable = formatter.out();
            String response = "Book[title=" +title+ ", author = " + author + "]";
            int length = response.length();
            if (response.length() < width) {
                response = "#".repeat(width - length) + response;
            }

            appendable.append(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}