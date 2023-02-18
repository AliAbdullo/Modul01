import java.util.Random;
import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"book", "laptop",
                "variable", "constant"};
        String[] translates = {"kitob", "notbuk",
                "o'zgaruvchi", "o'zgarmas"};

       /* for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " -> " + translates[i]);
        }*/

        int correct = 0;
        int incorrect = 0;

        while (true) {
            System.out.println("✔ " + correct + "   :   " + incorrect + " ❌");
            System.out.println();
            int index = random.nextInt(words.length);

            System.out.print(words[index] + " = ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(translates[index])) {
                correct++;
                System.out.println("Correct 😊");
            } else {
                incorrect++;
                System.out.println("Incorrect 🤔");
                System.out.println("Correct answer \"" + translates[index] + "\"");
            }

            if (correct + incorrect >= 5) break;
        }

        System.out.println("\n\n✔ " + correct + "   :   " + incorrect + " ❌");
        System.out.println("The End");
    }

    private static void learnRandom() {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("number = " + number);

        number = random.nextInt(101); // 0..100
        System.out.println("number = " + number);

        number = random.nextInt(40, 90); // 40..89
        System.out.println("number = " + number);
    }
}
