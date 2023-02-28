import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text");
        String text = scanner.nextLine();

        System.out.print("text.length() = " + text.length());

        for (int i = 0; i < text.length(); i++) {
            System.out.println("text.charAt(" + i + ") = " +
                    text.charAt(i));
        }

        System.out.println();

        char[] chars = text.toCharArray();
        for (char c : chars) {
            System.out.println("c = " + c);


            System.out.println("Enter text");

            // "Hello B29" -> lower chars: 4, upper chars: 2, digits: 2
            // Character.isLowerCase()
            // Character.isUpperCase()
            // Character.isDigit()

            int lowerChars = 0;
            int upperChars = 0;
            int digitChars = 0;

        /*for (char c : text.toCharArray()) {
            if(Character.isUpperCase(c)) upperChars++;
            if(Character.isLowerCase(c)) lowerChars++;
            if(Character.isDigit(c))     digitChars++;
        }*/

            for (int i = 0; i < text.length(); i++) {
                if(Character.isUpperCase(text.charAt(i))) upperChars++;
                if(Character.isLowerCase(text.charAt(i))) lowerChars++;
                if(Character.isDigit(text.charAt(i)))     digitChars++;
            }

            System.out.println("upperChars = " + upperChars);
            System.out.println("lowerChars = " + lowerChars);
            System.out.println("digitChars = " + digitChars);
        }
    }
}