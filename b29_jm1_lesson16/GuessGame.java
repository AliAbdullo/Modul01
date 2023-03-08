import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int low = 1000, high = 2000;

        int number = random.nextInt(low, high + 1);
        // System.out.println("number = " + number);

        System.out.printf("Computer thinks one number between %d and %d %n",
                low, high);
        long tryCount = Math.round(Math.log(high - low + 1) / Math.log(2)) + 1;
        System.out.println("tryCount = " + tryCount);

        int counter = 1;

        while (true) {
            System.out.printf("Enter your %d-guess: ", counter++);
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You found 😊");
                break;
            } else {
                System.out.println("You couldn't find 🤔");
                tryCount--;

                if (guess < number) {
                    System.out.println("That number is great than " + guess);
                } else {
                    System.out.println("That number is less than " + guess);
                }
            }

            if (tryCount == 0) break;
        }

        System.out.println("number = " + number);
    }
}
