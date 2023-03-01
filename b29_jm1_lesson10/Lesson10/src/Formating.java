import java.util.Random;
import java.util.Scanner;

public class Formating {
    public static void main(String[] args) {
        double x = 2;
        double y = x / 3.0;
        System.out.println(y);
        System.out.printf("%.2f %n",y);
        System.out.printf("%B %n",null);
        System.out.printf("%B %n",123);
        System.out.printf("%b %n",false);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
 /*       System.out.print("Your name : ");
        String name = scanner.nextLine();
        int age = random.nextInt(10,40);
        System.out.printf("Hello %S, Are you %d years old ?%n", name, age );
        System.out.printf("Hello %2$d, Are you %1$s years old ?%n", name, age );
        */
        System.out.printf("%2$+5.2f--%1$06.1f--%n", 34.34, 54.56, 87.88 );
    }
}
