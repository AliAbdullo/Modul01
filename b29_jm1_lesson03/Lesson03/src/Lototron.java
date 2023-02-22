import java.util.Random;
import java.util.Scanner;

public class Lototron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,};

        while (true) {
            int mark = random.nextInt(numbers.length);
            System.out.println("numbers = " + numbers);
            //34,6,8,45,77,35-1
        }


    }
}
