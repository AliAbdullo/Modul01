import java.util.Scanner;

/**
 * @author Abduganiyev Abdulloh
 * @time 13/03/2023  9:40
 * @description This is class used to is string
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satrni kitriting : ");
        String str = scanner.nextLine();
        System.out.println(sameStartEnd(str));
    }

    public static String sameStartEnd(String s) {
        String str = "";
        int index = s.lastIndexOf(s.charAt(0));
        if (index != -1 && index != 0) {
            str = s.substring(index);
            if (s.startsWith(str)) {
                return str;
            }
        }
        return str;
    }
}
