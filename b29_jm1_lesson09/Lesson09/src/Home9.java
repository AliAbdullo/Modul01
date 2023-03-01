import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Home9 {
    public static void main(String[] args) {
/*
        9) Kiritilgan satrdagi butun sonlarning yig'indisini aniqlash
        Input: "Today is 28 th of February in 2023", Output: 28+2023 = 2051
*/

    }
    public static int Number(String s1){
        Pattern pattern=Pattern.compile("[-/+]?\\d+");
        Matcher matcher=pattern.matcher(s1);
        int sum=0;
        while (matcher.find()){
            sum+=Integer.parseInt(matcher.group());
        }
        return sum;
    }
}
