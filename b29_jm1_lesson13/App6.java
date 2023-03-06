import java.util.Arrays;

public class App6 {
    public static void main(String[] args) {
//        int[][] matrix = new int[5][3];
//        JAGGED/Ragged Array
        int[][] matrix = {
                {1, 2, 3},
                {-7},
                {4, 74, -9, 40},
                {},
                {8, 9, 7},
        };
        // shape 5x?

        System.out.println("matrix.length = " + matrix.length);
        int[] array = matrix[4];
        System.out.println("array.length = " + array.length);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("matrix["+i+"].length = " + matrix[i].length);
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(Arrays.deepToString(matrix));

        System.out.println();

        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
