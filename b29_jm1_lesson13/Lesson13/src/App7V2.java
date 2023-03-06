import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App7V2 {
    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix();

        printMatrix(matrix, "foreach with matrix");
    }

    public static void printMatrix(int[][] matrix, String title) {
        System.out.println("\n "+title+"\n");

        for (int[] arr : matrix) {
            for (int value : arr) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] getRandomMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int row = random.nextInt(10);
        System.out.println("Enter row count "+row);

        int[][] matrix = new int[row][];

        for (int i = 0 ; i < matrix.length; i++) {
            matrix[i] = new int[random.nextInt(10)];
            System.out.printf("Enter count of elements for %d - row : %d \n", i+1, matrix[i].length);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }
}
