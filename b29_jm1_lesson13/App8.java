import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row count");
        int row = scanner.nextInt();

        System.out.println("Enter column count");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.printf("maxtrix[%d][%d] = ", i, j);
                //matrix[i][j] = scanner.nextInt();
                matrix[i][j] = new Random().nextInt(25);
            }
        }

        App7V2.printMatrix(matrix, "MATRIX");

        int[] maximumsByRows = new int[row];
        for (int i = 0; i < matrix.length; i++) {

            int max = matrix[i][0];

            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }

            maximumsByRows[i] = max;
        }

        int[] maximumsByColumns = new int[col];
        for (int i = 0; i < col; i++) {

            int max = matrix[0][i];

            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }

            maximumsByColumns[i] = max;
        }

        System.out.printf("\n");
        System.out.println(Arrays.toString(maximumsByRows));

        System.out.printf("\n");
        System.out.println(Arrays.toString(maximumsByColumns));

//        System.out.printf("\n");
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j] == maximumsByRows[i] &&
//                    matrix[i][j] == maximumsByColumns[j]){
//                    System.out.println("i = " + i+"   j = "+j);
//                }
//            }
//        }

        System.out.printf("****");
        int[][] matrix2 = new int[col][row];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }

        App7V2.printMatrix(matrix2, "new matrix");
    }
}
