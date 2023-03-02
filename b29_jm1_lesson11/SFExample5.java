import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class SFExample5 {
    public static void main(String[] args) {
        // Datetime Format
        Date date = new Date();

        System.out.printf(Locale.US,"%tA %n", date);
        System.out.printf(Locale.FRANCE,"%tA \n", date);
        System.out.printf(Locale.ITALY,"%tA %n", date);
        System.out.printf(Locale.CHINESE,"%tA %n", date);
        System.out.printf("%tA %n", date);
        System.out.printf("%tA %n", date);
        System.out.printf("%ta %n", date);
        System.out.printf("%tc %n", date);
        System.out.println(date);

/*        String text = "JhkJAVAlsdjhjjavaSHdhkJavajAVa";

        String replace = text
                .replaceAll("(?i)java", "*");
        System.out.println(replace);*/
        System.out.println();

        String content = """
                Java-da String Constant pool nima ?
                Java-da String literal nima ?
                String literal xotirada qanday saqlanadi ?
                Nima uchun Java String literaldan foydalanadi ?
                Quyidagi code da nechta object yaratiladi? """;

        System.out.println(content);
        System.out.println("****");

        System.out.println();
        String s1 = new String("Scientech");
        String s2 = new String("Scientech");
        String s3 = "Scientech";
        String s4 = "Scientech";

        System.out.println((s1 == s3));
        System.out.println((s1.intern() == s3));

        System.out.printf("%s %s \n", "😊", new Date());
        System.out.printf("%s %s %n", "😊", new Random().toString());
        System.out.println();

        // FQCN => Fully Qualified Class Name
        // java.util.Random
        // java.util.Date
        // java.sql.Date

        String message =
                MessageFormat
                        .format("I am {1}. I am {2} y.o. Today is {0}",
                                new Date(), "Alibek", 18);
        System.out.println(message);

        System.out.println();

        System.out.printf("I am %s %s %n", "Alibek", "Aliyev");
        System.out.printf("I am %2$s %1$s %n", "Alibek", "Aliyev");

        System.out.printf("Day of week %tA abc %<ta", new Date());
    }
}









