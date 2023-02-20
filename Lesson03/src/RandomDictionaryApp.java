import java.util.Scanner;

public class RandomDictionaryApp {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"book", "laptop",
                "variable", "constant", "son", "number"};
        String[] translates = {"kitob", "notbuk",
                "o'zgaruvchi", "o'zgarmas", "o'g'il", "son"};

//        for (int i = 0; i < words.length; i++) {
//            System.out.println("\""+words[i]+"\", \""+translates[i]+'\"');
//        }

        int correct = 0;
        int incorrect = 0;

        while (true) {
            System.out.println("✔ " + correct + "   :   " + incorrect + " ❌");
            System.out.println();
            int index = random.nextInt(words.length);
            boolean choose = random.nextBoolean();
            // true => eng -> uzb
            // false => uzb -> eng

            String word = "", translate = "";
            if(choose) {
                word = words[index];
                translate = translates[index];
                System.out.println("eng -> uzb");
            }
           else {
                word = translates[index];
                translate = words[index];
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
