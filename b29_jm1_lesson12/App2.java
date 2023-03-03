import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("arr = " + Arrays.toString(arr));

    }
}
