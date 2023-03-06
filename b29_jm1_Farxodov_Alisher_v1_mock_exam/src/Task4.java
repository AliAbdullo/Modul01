import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[8][8];
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        fillPlacesQueenCanGo(i, j, a);
        showMatrix(a);
    }

    static void fillPlacesQueenCanGo(int i, int j, int[][] a){
        // fill row and column
        for (int k = 0; k < 8; k++) {
            a[i][k] = 1;
            a[k][j] = 1;
        }

        // fill second diagonal
        for (int k = 0; k < 8; k++)
            for (int l = 0; l < 8; l++)
                if (k + l == i + j)
                    a[k][l] = 1;

        // fill first diagonal
        int rowIndex = Math.max(i - j, 0);
        int colIndex = Math.max(j - i, 0);
        while (rowIndex < 8 && colIndex < 8){
            a[rowIndex++][colIndex++] = 1;
        }

        // current place of queen
        a[i][j] = 2;
    }

    static void showMatrix(int[][] a){
        for (int[] row : a) {
            for (int el : row)
                System.out.printf("\t%d", el);

            System.out.println();
        }
    }
}
