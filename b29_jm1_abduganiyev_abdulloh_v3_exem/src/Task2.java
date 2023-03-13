import java.util.Scanner;

/**
 * @author Abduganiyev Abdulloh
 * @time 13/03/2023  10:15
 * @description This is class used to is palindrom number
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int number = scanner.nextInt();

        System.out.println(palindromeNumber(number));
    }

    /**
     * @param x number
     * @return is palindrom boolean
     * @description This method used to number is palindrom
     */
    public static boolean palindromeNumber(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
