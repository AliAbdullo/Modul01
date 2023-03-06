import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int max = a;
        int maxCount = 1;

        while (true) {
            a = scanner.nextInt();

            if (a == 0)
                break;

            if (a > max) {
                max = a;
                maxCount = 1;
            } else if (a == max) maxCount++;
        }

        System.out.println("max = " + max);
        System.out.println("maxCount = " + maxCount);
    }
}
