import java.util.Arrays;

public class App7V3 {
    public static void main(String[] args) {
        int[][] matrix = App7V2.getRandomMatrix();

        App7V2.printMatrix(matrix, "\n foreach with matrix\n");

        for (int[] arr : matrix) {
            Arrays.sort(arr);
            int max = arr[arr.length-1];
            System.out.println(Arrays.toString(arr)+" >>> max = "+max);
        }
    }
}
