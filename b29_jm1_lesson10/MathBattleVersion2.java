package b29_jm1_lesson10;

import java.util.Random;
import java.util.Scanner;

public class MathBattleVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int live = 3;

        System.out.println(" *** Math Battle *** ");

        while (true) {
            System.out.printf("%n score = %d, live = %d %n%n", score, live);

            if (live <= 0) break;

            char operation = getRandomOperation();
            int[] nums = getOperations(operation);
            int num1 = nums[0];
            int num2 = nums[1];
            int correctAnswer = nums[2];

            int demoAnswer = getDemoAnswer(correctAnswer);
            System.out.printf("%d %c %d = %d %n", num1, operation, num2, correctAnswer);

            System.out.println("1.  \t 0. ");
            System.out.print("?: ");
            String answer = scanner.nextLine();

            boolean isCorrect = checkAnswer(answer, correctAnswer, demoAnswer);
            if (isCorrect) {
                score++;
            } else {
                live--;
            }
        }

        System.out.println("GAME FINISHED");

    }

    private static char getRandomOperation() {
        Random random = new Random();

        String operations = "+-*/";
        int operationIndex = random.nextInt(operations.length());

        return operations.charAt(operationIndex);
    }
    private static boolean checkAnswer(String answer, int correctAnswer, int demoAnswer) {
        return (answer.equals("1") && correctAnswer == demoAnswer ||
                answer.equals("0") && correctAnswer != demoAnswer
        );
    }

    private static int getDemoAnswer(int correctAnswer) {
        Random random = new Random();

        return random.nextBoolean()
                ? correctAnswer
                : correctAnswer + (random.nextBoolean() ? 1:-1);
    }

    private static int[] getOperations(char operation) {
        Random random = new Random();

        int a = 10, b = 5;
        int correctAnswer = a + b;

        switch (operation) {
            case '+' -> {
                a = random.nextInt(1, 101);
                b = random.nextInt(1, 101);
                correctAnswer = a + b;
            }
            case '-' -> {
                b = random.nextInt(1, 101);
                a = random.nextInt(b + 1, 21 + b);
                correctAnswer = a - b;
            }
            case '*' -> {
                a = random.nextInt(1, 15);
                b = random.nextInt(1, 15);
                correctAnswer = a * b;
            }
            case '/' -> {
                b = random.nextInt(1, 15);
                a = b * random.nextInt(1, 15);
                correctAnswer = a / b;
            }
        }
        return new int[]{a, b, correctAnswer};

    }
}





