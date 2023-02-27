import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SonTopish {
    public static void main(String[] args) {
        String muntazamIfoda = "([+|-]?(\\d+(\\.\\d*)?))|([+|-]?(\\/\\d+))";
        String matn = "16 ning kvadrati 256 va 6.25 ning " +
                "kvdadrat ildizi -2.5 va -.243 0.21234 dan kichik";
        Pattern tartib = Pattern.compile(muntazamIfoda);
        Matcher moslik = tartib.matcher(matn);
        while (moslik.find()){
            for (int i = 0; i <= moslik.groupCount(); i++)
            System.out.println(i+"-guruh: " + moslik.group(i));
        }
    }
}
