import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomDictionaryAppVersionThree {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Ctrl+Alt+L:   code format style

        String[][] dictionary = {
                {"book",     "kitob"},
                {"laptop",   "notbuk"},
                {"constant", "o'zgarmas"},
                {"son",      "o'g'il"},
                {"number",   "son"},
        };

        int correct = 0;
        int incorrect = 0;

        while (!isEmptyDictionary(dictionary)) {
            int index = random.nextInt(dictionary.length);

            if(dictionary[index] == null) continue;

            System.out.println("✔ " + correct + "   :   " + incorrect + " ❌");
            System.out.println();

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
                dictionary[index] = null;
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

    private static boolean isEmptyDictionary(String[][] dictionary) {
        for (String[] arr : dictionary) {
            if(arr != null) return false;
        }
        return true;
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
