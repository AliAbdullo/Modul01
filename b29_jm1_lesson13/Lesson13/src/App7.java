import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter row count");
        int row = scanner.nextInt();

        int[][] matrix = new int[row][];

        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("Enter count of elements for %d - row : ", i + 1);
            matrix[i] = new int[scanner.nextInt()];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.printf("matrix[%d][%d] = ", i, j);
//                matrix[i][j] = scanner.nextInt();

                matrix[i][j] = random.nextInt(101);
            }
        }

        System.out.println("matrix = " + Arrays.deepToString(matrix));

        System.out.println("\n foreach with matrix\n");

        for (int[] arr : matrix) {
            for (int value : arr) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

    }
}
