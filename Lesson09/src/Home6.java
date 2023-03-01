import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
/*        6) Kiritilgan satrni uz card yoki humo karta raqami ekanligini tekshiring
        Input: 8600123412341234   Output: “uz card”
        Input: 9860123412341234   Output: “humo card”
        Input: 4045123412341234   Output: “other card”
        Input: abcd123412341234   Output: “invalid card number”*/

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter uz card or humo card number: ");
        String cardNumber = sc.nextLine();

        System.out.println("cardNumber = " + cardChackNumber(cardNumber));


    }

    private static String cardChackNumber(String cardNumber) {
        boolean checkUzCard=cardNumber.matches("8600[0-9]{12}");
        return "UzCard";

//        boolean checkHumo=cardNumber.matches("9860[0-9]{12}");
//        return "Humo card";

/*        boolean check=cardNumber.matches("^(^9860|8600)[0-9]{12}");
        return "Other card";*/
    }
}
