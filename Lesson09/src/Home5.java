import java.util.Scanner;

public class Home5 {
    public static void main(String[] args) {
        /*
        5) Kiritilgan satrni uz card karta raqami ekanligini tekshiring
        Input: 8600123412341234   Output: true
        Input: 4045123412341234   Output: false*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Karta raqamingizni kiriting: ");
        String cardNum = scanner.nextLine();
        System.out.println("cardNum = " + cardNumberChack(cardNum));;


    }

    private static boolean cardNumberChack(String word) {
        if(word.matches("8600[0-9]{12}")){
            return true;
        }
        return false;
    }
}
