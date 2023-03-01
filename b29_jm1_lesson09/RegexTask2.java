import java.util.Scanner;

public class RegexTask2 {
    public static void main(String[] args) {

        // 2. Kiritilgan satrni uz card yoki humo karta raqami ekanligini tekshiring

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter uz card or humo card number: ");
        String cardNumber = sc.nextLine();

        boolean checkUzCard=cardNumber.matches("8600[0-9]{12}");
        System.out.println("checkUzCard = " + checkUzCard);

        boolean checkHumo=cardNumber.matches("9860[0-9]{12}");
        System.out.println("checkHumo = " + checkHumo);

        boolean check=cardNumber.matches("(9860|8600)[0-9]{12}");
        System.out.println("check = " + check);

    }
}
