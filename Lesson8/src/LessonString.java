import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonString {
    public static void main(String[] args) {
        String muntazamIfoda = "z.r";
        String matn = "zerikarli Zarar zar munozara dazarma " +
                "nazar zarur zarb buldozer lazer ozor bozor " +
                "televizor hozir vazir zirak ziravor huzur zurriyot";
        char[] belgi = new char[matn.length()];

        Pattern tartib = Pattern.compile(muntazamIfoda);
        Matcher mostlik = tartib.matcher(matn);

        int sanoq = 0;
        while (mostlik.find()){
            sanoq++;
            System.out.println(sanoq+") "+
                    mostlik.start()+"~"+mostlik.end() +
                    "oraliqda mostlik topildi.");
            Arrays.fill(belgi, mostlik.start(),mostlik.end(), '^');
        }
        System.out.println(matn);
        System.out.println(new String(belgi));
        System.out.println("Jami "+sanoq+" ta mostlik topildi.");

    }
}
