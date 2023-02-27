import java.util.Arrays;
import java.util.StringJoiner;

public class App3 {
    public static void main(String[] args) {
        // join

        String join = String.join(", ",
                "Sunnat", "Ibrohim", "Nodir");

        join = "["+join+"]";
        System.out.println("join = " + join);


        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Sunnat");
        joiner.add("Ibrohim");
        joiner.add("Nodir");

        System.out.println("joiner = " + joiner);

        System.out.println();
        String[] students = {"Sunnat", "Ibrohim", "Nodir"};
        System.out.println("students = " + Arrays.toString(students));

    }
}
