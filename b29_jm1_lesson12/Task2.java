import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 1) N ta butun sondan iborat array berilgan.
        // Arrayning 59 dan katta elementlari sonini toping.

        // 2) N ta butun sondan iborat array berilgan.
        // Array elementlarining yig'indisi toping.

        // 3) N ta butun sondan iborat array berilgan.
        // Array elementlarining kattasini toping.

        // 4) N ta String dan iborat array berilgan.
        // Eng uzun elementlarning barchasini toping.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Raqmalar nechta bo'lishini kiriting: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.printf("%d-element %d",i);
        }


    }
}
