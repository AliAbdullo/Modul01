import java.util.Scanner;

public class forLesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);

        System.out.println("max = " + max);

        System.out.println("Hello");

    }
}
