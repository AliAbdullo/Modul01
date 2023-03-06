import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Task=8
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements' count");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        System.out.println("arr = "+ Arrays.toString(arr));
        System.out.println();
    }
}
