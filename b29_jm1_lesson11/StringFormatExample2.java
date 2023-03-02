import java.util.Random;

public class StringFormatExample2 {
    public static void main(String[] args) {

        System.out.println(String.format("%b", true));
        System.out.println(String.format("%B", false));
        System.out.println(String.format("%b", null));
        System.out.println(String.format("%h", new Random()));
        System.out.println(String.format("%H", new Random()));
        System.out.println(String.format("%s", "Alish"));
        System.out.println(String.format("%S", "Alish"));
        System.out.println(String.format("%c", 'a'));
        System.out.println(String.format("%C", 'a'));
        System.out.println(String.format("%d", 22));
        System.out.println(String.format("%o", 10));
        System.out.println(String.format("%x", 13));
        System.out.println(String.format("%X", 13));
        System.out.println(String.format("%e", 3.05f));
        System.out.println(String.format("%E", 4.05E-4f));
        System.out.println(String.format("%f", 33.05));
        System.out.println(String.format("%g", 33.1234567));
        System.out.println(String.format("%G", 33.490001f));
        System.out.println(String.format("%G", 3.59111111));
        System.out.println(String.format("%a", 13.5));
        System.out.println(String.format("%A", 1.8));
    }
}
