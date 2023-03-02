import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
/*
        System.out.printf("%,d %n", 10000);
        System.out.printf(Locale.ENGLISH,"%,d %n", 10000);
        System.out.printf(Locale.GERMAN,"%,d %n", 10000);*/

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = new Random().nextInt(10,30);
       /* String pattern = "Hello %S, are you %d years old ?";
        String message = String.format(pattern, name, age);
        System.out.println(message);*/

        String pattern = "Hello %S, are you %d years old ?";
        String message = "Hello %S, are you %d years old ?"
                        .formatted( name, age);
        System.out.println(message);

    }
}