import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(parseUpperLower(str));
    }

    static String parseUpperLower(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                newStr = newStr.concat(Character.toLowerCase(str.charAt(i)) + "");

            else if (Character.isLowerCase(str.charAt(i)))
                newStr = newStr.concat(Character.toUpperCase(str.charAt(i)) + "");

            else
                newStr = newStr.concat(str.charAt(i) + "");
        }

        return newStr;
    }
}
