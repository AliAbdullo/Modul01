import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = " ?  c c++ java!ruby c# .    javascript python  . ";

        String[] parts = text.replaceAll("[\\s.\\-!?,;:]+", " ")
                .trim()
                .split("\\s+");

        System.out.println("parts.length = " + parts.length);
        System.out.println("parts = " + Arrays.toString(parts));

    }
}
