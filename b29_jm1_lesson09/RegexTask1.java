import java.util.Scanner;

public class RegexTask1 {
    public static void main(String[] args) {
        // 1. Kiritilgan satrni uz card karta raqami ekanligini tekshiring

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter uz card number: ");
        String cardNumber = sc.nextLine();

        boolean matches=cardNumber.matches("8600[0-9]{12}");

        System.out.println(matches);

    }
}
