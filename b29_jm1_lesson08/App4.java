import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class App4 {
    public static void main(String[] args) {
        // split
        String text = "c c++ java c# javascript python";
        // "c c++ " " c# " "script python";
        /*String[] parts = text.split(" ");
        String[] parts = text.split("a");
        String[] parts = text.split("java");
        String[] parts = text.split("Java");*/
        String[] parts = text.split(" ", 3);

        System.out.println("parts = " +
                Arrays.toString(parts));

        System.out.println();
//        StringTokenizer tokenizer = new StringTokenizer(text, "java");
        StringTokenizer tokenizer = new StringTokenizer(text, " ", true);

        while (tokenizer.hasMoreTokens()) {
            String s = tokenizer.nextToken();
            System.out.println("s = " + s);
        }



    }
}
