import java.util.Scanner;

/**
 * @author Abduganiyev Abdulloh
 * @time 13/03/2023  10:15
 * @description This is class used to is string boolean
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("So'z kiriting: ");
        String string = scanner.nextLine();

        System.out.println(isBob(string));


    }

    /**
     * @param str word
     * @return boolean
     * @description This method used to is bob
     */
    public static boolean isBob(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            char b = 'b';
            if (str.charAt(i) == b && str.charAt(i + 2) == b) {
                return true;
            }
        }
        return false;
    }
}
