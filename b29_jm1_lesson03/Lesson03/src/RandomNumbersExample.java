import java.util.Arrays;
import java.util.Random;

public class RandomNumbersExample {
    public static void main(String[] args) {

        int[][] combinators = new int[100][6];

        for (int i = 0; i < combinators.length; i++) {
            combinators[i] = getNumbers();
        }

        // game
        int[] numbers = getNumbers();

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }*/
        System.out.println("game numbers = " + Arrays.toString(numbers));

        // check combinators
        for (int[] combinator : combinators) {
            int count = checkTicket(combinator, numbers);
            System.out.println("combinator = " +
                    Arrays.toString(combinator)+" "+count+" ta");
        }
    }

    public static int checkTicket(int[] combinator, int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            for (int value : combinator) {
                if(number == value) counter++;
            }
        }
        return counter;
    }

    public static int[] getNumbers() {
        Random random = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(36) + 1;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }

        return numbers;
    }
}
