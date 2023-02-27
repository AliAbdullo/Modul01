import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text");
        String text = scanner.nextLine();

        System.out.println("text.length() = " + text.length());

        for (int i = 0; i < text.length(); i++) {
            System.out.println("text.charAt("+i+") = " +
                    text.charAt(i));
        }

        System.out.println();

        char[] chars = text.toCharArray();
        for(char c : chars){
            System.out.println("c = " + c);
        }
    }
}
