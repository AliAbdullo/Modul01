import java.util.Random;
import java.util.Scanner;

public class ArraysCodeUzLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Massiv uzunligini kiriting: ");

        int n = scanner.nextInt();

        if(n > 0){
            int[] massiv = new int[n];
            for (int i = 0; i < n; i++) {
                massiv[i] = (int)Math.pow(2,i);
                System.out.print(massiv[i]+" ");
            }
        }
    }
}
