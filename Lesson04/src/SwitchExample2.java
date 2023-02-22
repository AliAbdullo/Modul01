import java.util.Random;

public class SwitchExample2 {
    public static void main(String[] args) {
        Random random = new Random();

        int monthNumber = random.nextInt(1, 12 + 1);
        System.out.println("monthNumber = " + monthNumber);


        // switch expression
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn (fall)";
            default -> "wrong season number";
        };

        System.out.println("season = " + season);

    }
}
