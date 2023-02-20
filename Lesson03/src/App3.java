import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
//        dataType variable =
//                  condition ? valueWhenConditionEqualsTrue
//                            : valueWhenConditionEqualsTrue;

        Scanner scanner = new Scanner(System.in);

        // Ctrl+D => copy line or selected part of code
        // Alt+Shift+(Up|Down) -> move code part
        // Alt + J => marking matches

        System.out.println("num1 = ");
        int num1 = scanner.nextInt();

        System.out.println("num2 = ");
        int num2 = scanner.nextInt();

//        String result = num1 > num2 ? "katta" : "kichik";
        String result = num1 > num2 ? "katta"
                                    : num1 < num2 ? "kichik" :  "teng";
        System.out.println("result = " + result);
    }
}
