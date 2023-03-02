import java.util.Random;
import java.util.Scanner;

public class MathBattleOfJamshid {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correct = 0;
        int incorrect = 0;
        System.out.println("✔ " + correct + "   :   " + incorrect + " ❌");
        System.out.println();

        while (true) {

            int a = random.nextInt(100);
            int b = random.nextInt(50);
            int c = random.nextInt(10);
            int d = random.nextInt(15);
            int choose = random.nextInt(5);
            int choose2 = random.nextInt(2);
            int ch1 = 0;

            if (choose == 1) {
                if (a % b == 0) {
                    System.out.print(a + " / " + b + " = ");

                    if (choose2 == 1) {
                        System.out.println(a / b);
                        ch1 = 1;
                    } else {
                        System.out.println(a / b + random.nextInt(15));
                    }

                    System.out.println("true/false = ");

                    int answer = Integer.parseInt(scanner.next());

                    if (answer == ch1) {
                        correct++;
                        System.out.println("Correct 😊");
                    } else {
                        incorrect++;
                        System.out.println("Incorrect 🤔");

                    }

                }
            }
            if (choose == 2) {
                System.out.print(a + " + " + b + " = ");


                if (choose2 == 1) {
                    System.out.println(a + b);
                    ch1 = 1;
                } else {
                    System.out.println(a + b + random.nextInt(15));
                }

                System.out.println("true/false = ");

                int answer = Integer.parseInt(scanner.next());

                if (answer == ch1) {
                    correct++;
                    System.out.println("Correct 😊");
                } else {
                    incorrect++;
                    System.out.println("Incorrect 🤔");

                }
            }
            if (choose == 3) {

                System.out.print(c + " * " + d + " = ");

                if (choose2 == 1) {
                    System.out.println(c * d);
                    ch1 = 1;
                } else {
                    System.out.println(c * d + random.nextInt(15));
                }

                System.out.println("true/false = ");

                int answer = Integer.parseInt(scanner.next());

                if (answer == ch1) {
                    correct++;
                    System.out.println("Correct 😊");
                } else {
                    incorrect++;
                    System.out.println("Incorrect 🤔");

                }
            }
            if (choose == 4) {
                System.out.print(a + " - " + b + " = ");

                if (choose2 == 1) {
                    System.out.println(a - b);
                    ch1 = 1;
                } else {
                    System.out.println(a - b + random.nextInt(15));
                }

                System.out.println("true/false = ");

                int answer = Integer.parseInt(scanner.next());

                if (answer == ch1) {
                    correct++;
                    System.out.println("Correct 😊");
                } else {
                    incorrect++;
                    System.out.println("Incorrect 🤔");

                }
            }
            if (incorrect >= 3) break;
        }

        System.out.println("\n\n✔ " + correct + "   :   " + incorrect + " ❌");
        System.out.println("The End");
    }
}
