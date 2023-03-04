import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int row = random.nextInt(1,10);
        int table = random.nextInt(20);
        int three = random.nextInt(99);

        int [][][] matrix = new int[row][table][three];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                for (int k = 0; k < matrix[i][j].length; k++) {
//                    matrix [i][j]= random.nextInt(99);

                }
            }
            for (int[][] element : matrix) {
                System.out.println(element);
            }
        }

    }

