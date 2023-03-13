import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isAddNumber;
        do {
            System.out.println("Iltimos toq son kiriting : ");
            n = scanner.nextInt();
            isAddNumber = n % 2 == 1;
            if (isAddNumber) {
                int[][] massiv = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        massiv[i][j] = i + 1;
                        System.out.print(massiv[i][j] + " ");
                    }
                    System.out.println();
                }
                massiv(massiv);
            }


        }while (!isAddNumber);
    }


    public static void massiv(int[][] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i == j || j == massiv.length-1-i ) {
                    System.out.print(massiv[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


}
