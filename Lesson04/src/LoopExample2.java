import java.util.Scanner;
import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        //task5();
        //task6();
    }

    public static void task6() {

    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();

        printFirstNPrimeNumbers(number);
    }

    public static void printFirstNPrimeNumbers(int n) {
        for (int number = 2, counter = 1; counter <= n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                counter++;
            }
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();

        printPrimeNumberToN(number);
    }

    public static void printPrimeNumberToN(int n) {
        for (int number = 2; number <= n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);
        System.out.println("isPrime = " + isPrime);
    }

    // 100
    // 1   2   4   5   10  20 25  50  100
    // 100 50  25  20  10  5  4   2   1

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

/*    public static boolean isPrime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                counter++;
            }
        }
        return counter == 2;
    }*/

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();

        String divisors = getDivisorsOfNumber(number);
        System.out.println(divisors);

    }

    public static String getDivisorsOfNumber(int number) {
        if (number < 1) {
            return "This number hasn't got positive divisors";
        }

        String str = "";

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                str = str + i + " ";
                // System.out.println("i = " + i);
            }
        }

        return str;
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("left = ");
        int left = scanner.nextInt();

        int right;
        do {
            System.out.print("right (min = " + left + ") = ");
            right = scanner.nextInt();
        } while (right < left);

        int result = sumOfNumbersFromAToB(left, right);
        System.out.println("result = " + result);
    }

    // public, protected, default (package), private
    public static int sumOfNumbersFromAToB(int low, int high) {
        int total = 0;

        for (int i = Math.min(low, high); i <= Math.max(low, high); i++) {
            total += i;
        }

        return total;
    }
}