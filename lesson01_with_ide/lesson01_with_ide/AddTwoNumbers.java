//import java.util.*;

import java.util.Scanner;

public class AddTwoNumbers {
    // psvm, main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sout
        System.out.println("This program calculates sum of two numbers");

        System.out.println("Enter first number");
        double numberOne = scanner.nextDouble();

        System.out.println("Enter second number");
        double numberTwo = scanner.nextDouble();

        double sum = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
    }
}
