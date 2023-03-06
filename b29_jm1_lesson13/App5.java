public class App5 {
    public static void main(String[] args) {
//        int[][] matrix = new int[5][3];
        int[][] matrix = {
                {1, 2, 3},
                {-7, 8, 9},
                {4, 74, -9},
                {4, 5, 6},
                {8, 9, 7},
        };
        // shape 5x3

        System.out.println("matrix.length = " + matrix.length);
        int[] array = matrix[4];
        System.out.println("array.length = " + array.length);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("matrix["+i+"].length = " + matrix[i].length);
        }
    }
}
