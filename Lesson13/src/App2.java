import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] matrix = getRandom(random);

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            max= matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if( matrix[i][j]> max)
                    max = matrix[i][j];
            }
        }
        System.out.println(max);

    }

    private static int[][] getRandom(Random random) {
        int row = random.nextInt(40);
        System.out.println("Enter row count "+ row);

        int[][] matrix = new int[row][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[random.nextInt(6)];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("matrix = " + Arrays.deepToString(matrix));

        System.out.println("\n foreach with matrix\n");

        for (int[] arr : matrix) {
            for (int value : arr) {
                System.out.print(value+" ");
            }
            System.out.println();
        }
        return matrix;
    }
}

