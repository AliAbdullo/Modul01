import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask5 {
    public static void main(String[] args) {
        // 5. Kiritilgan satrdagi butun sonlarning yig'indisini aniqlash
        // Example: "Today is 28 th of February in 2023" => 28+2023 = ?

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("[+\\-]?\\d+");
        Matcher matcher = pattern.matcher(text);

        int sum = 0;

        while (matcher.find()){
            // System.out.println(matcher.group());
            sum += Integer.parseInt(matcher.group());
        }

        System.out.println("sum = " + sum);

    }
}









