import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting : ");
        int number = scanner.nextInt();
        System.out.println(sumDigit(number));

    }
    public static int sumDigit(int number){
        if(number == 0) return 0;
        int sum = number % 10;
        return sum + sumDigit(number / 10);
    }
}
