import java.util.Random;
import java.util.Scanner;

public class RandomDictionaryAppVersionTwo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Ctrl+Alt+L:   code format style

        String[][] dictionary = {
                {"book",     "kitob"},
                {"laptop",   "notbuk"},
                {"variable", "o'zgaruvchi"},
                {"constant", "o'zgarmas"},
                {"son",      "o'g'il"},
                {"number",   "son"},
        };

        int correct = 0;
        int incorrect = 0;

        while (true) {
            System.out.println("✔ " + correct + "   :   " + incorrect + " ❌");
            System.out.println();
            int index = random.nextInt(dictionary.length);
            boolean choose = random.nextBoolean();
            // true => eng -> uzb
            // false => uzb -> eng

            String word = "", translate = "";
            if (choose) {
                word = dictionary[index][0];
                translate = dictionary[index][1];
                System.out.println("eng -> uzb");
            } else {
                word = dictionary[index][1];
                translate = dictionary[index][0];
                System.out.println("uzb -> eng");
            }

            System.out.print(word + " = ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(translate)) {
                correct++;
                System.out.println("Correct 😊");
            } else {
                incorrect++;
                System.out.println("Incorrect 🤔");
                System.out.println("Correct answer \"" + translate + "\"");
            }


            if (correct + incorrect >= 10) break;
        }

        System.out.println("\n\n✔ " + correct + "   :   " + incorrect + " ❌");
        System.out.println("The End");
    }


    private static void learnRandom() {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt();
        System.out.println("number = " + number);

        number = random.nextInt(101); // 0..100
        System.out.println("number = " + number);

        number = random.nextInt(40, 90); // 40..89
        System.out.println("number = " + number);
    }
}
