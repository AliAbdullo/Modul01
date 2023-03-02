import java.util.Random;
import java.util.Scanner;

public class MathBattleOfNodirF {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int live = 3;

        System.out.println(" *** MATH BATTLE ***");
        System.out.print("Easy or Hart or Exspert0/1/2 = ");
        int type = scanner.nextInt();
        scanner = new Scanner(System.in);
        if(type>3 || type<0) {System.out.println("xato");
            return;}
        int sanoq=0;
        while (true) {
            System.out.printf("%n score = %d,  live = %d %n%n", score, live);

            if (live <= 0) break;

            char operation = getRandomOperation();

            int[] nums = getOperands(operation);
            int num1 = nums[0];
            int num2 = nums[1];
            int correctAnswer = nums[2];

            int demoAnswer = getDemoAnswer(correctAnswer);

            System.out.printf("%d %c %d = %d %n", num1, operation, num2, demoAnswer);

            System.out.println("1. ✔ \t 0. ❌");
            System.out.print("?: ");
            String answer = scanner.nextLine();

            boolean isCorrect = checkAnswer(answer, correctAnswer, demoAnswer);
            if (isCorrect) {
                score++;
                if(type==0){
                    live++;}
                if(type==1){
                    sanoq++;
                    if(sanoq==3){
                        live++;}}
            }  else {
                live--;
            }
        }

        System.out.println("GAME FINISHED");


    }

    private static boolean checkAnswer(String answer,
                                       int correctAnswer,
                                       int demoAnswer) {
        return (
                answer.equals("1") && correctAnswer == demoAnswer ||
                        answer.equals("0") && correctAnswer != demoAnswer
        );
    }

    private static int getDemoAnswer(int correctAnswer) {
        Random random = new Random();

        return random.nextBoolean()
                ? correctAnswer
                : correctAnswer + (random.nextBoolean() ? 1 : -10);
    }

    private static int[] getOperands(char operation) {
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

    private static char getRandomOperation() {
        Random random = new Random();

        String operations = "+-*/";

        int operationIndex = random.nextInt(operations.length());

        return operations.charAt(operationIndex);
    }
}



