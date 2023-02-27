import java.util.Scanner;

public class App5V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text");
        String text = scanner.nextLine();

        // "hello" -> "hheelllloo"

        String res = "";

        /*for (int i = 0; i < text.length(); i++) {
            res = res + text.charAt(i)+text.charAt(i);
        }*/
        /*for (int i = 0; i < text.length(); i++) {
            res += text.charAt(i);
            res += text.charAt(i);
        }*/
        for (char c : text.toCharArray()) {
            res = res + c + c;
        }
        /*for (char c : text.toCharArray()) {
            res = res.concat(String.valueOf(c)).concat(String.valueOf(c));
        }*/

        System.out.println(res);


    }
}
