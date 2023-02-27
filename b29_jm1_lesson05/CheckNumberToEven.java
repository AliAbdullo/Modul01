import java.util.Scanner;

public class CheckNumberToEven {
    public static void main(String[] args) {
        // n = 17 => 10000000000
        // n = 18 => 0000000000

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number");
        int number = scanner.nextInt();
        System.out.println("number = " + number);

//        boolean isEven = (number << 31) == 0;
//        System.out.println("isEven = " + isEven);

        boolean isEven2 = (number & 1) == 0;
        System.out.println("isEven2 = " + isEven2);

        boolean isOdd =  (number << 31) != 0;
        System.out.println("isOdd = " + isOdd);

    }
}
