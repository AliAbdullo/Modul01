import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Abduganiyev Abdulloh
 * @time 13/03/2023  10:40
 * @description This is class used to is testing number
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int number = scanner.nextInt();

        testNumber(number);
    }

    /**
     * @param a number
     * @description This method used to number is count. Translation is soryy
     */
    private static void testNumber(int a) {
        int[] digits = new int[String.valueOf(a).length() + 1];
        for (int i = 0; i < digits.length - 1; i++) {
            digits[i] = a % 10;
            a = a / 10;
        }

        digits[digits.length - 1] = -1;

        Arrays.sort(digits);
        int count = 0;

        for (int i = digits.length - 1; i > 0; i--) {
            count++;
            if (digits[i] != digits[i - 1]) {
                System.out.printf("%d raqami %d marta qatnashdi; ", digits[i], count);
                count = 0;
            }
        }
    }
}
