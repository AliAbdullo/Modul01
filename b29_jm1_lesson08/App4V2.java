import java.util.Arrays;
import java.util.StringTokenizer;

public class App4V2 {
    public static void main(String[] args) {
        // split
        String text = "c c++ java c# .    javascript python";

        String[] parts = text.split("[.,?!-:;\\s]+?.");

        System.out.println("parts.length = " + parts.length);
        System.out.println("parts = " +
                Arrays.toString(parts));

    }
}
