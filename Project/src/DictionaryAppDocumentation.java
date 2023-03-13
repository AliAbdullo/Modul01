import java.util.Random;
import java.util.Scanner;

/**
 * @author Abdug'aniyev Abdulloh
 * @time 12/03/2023 18:18:18
 * @description : This class is used to dictionary app...
 */


public class DictionaryAppDocumentation {
    static int index;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " -> " + translates[i]);
        }*/

        int correct = 0;
        int shans = 3;

        while (shans > 0) {
            String str = randomWords();
            System.out.print(str + " -> ");
            String answer = scanner.next();
            boolean isEqual = isEquals(answer);
            if (isEqual) {
                System.out.println("correct !!!");
                correct++;
            } else {
                shans--;
            }
        }
        System.out.println("Sizning balingiz --" + correct);

    }

    /**
     * @param answer is a string param
     * @return boolean
     * @descrition : This method is used to equals words
     */
    public static boolean isEquals(String answer) {
        String[] translates = {"kitob", "noutbuk",
                "o'zgaruvchi", "o'zgarmas"};

        return translates[index].equals(answer.trim());
    }

    /**
     * @return String word
     * @description This method is used to random word
     */
    public static String randomWords() {
        Random random = new Random();

        String[] words = {"book", "laptop",
                "variable", "constant"};

        index = random.nextInt(0, words.length);
        return words[index];
    }
}
