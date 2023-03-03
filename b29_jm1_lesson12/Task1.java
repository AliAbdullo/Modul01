import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1) N ta butun sondan iborat array berilgan.
        // Arrayning 59 dan katta elementlari sonini toping.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Arrayning uzunligini kiriting: ");
        int len = scanner.nextInt();

        if(len < 0){
            System.out.println("Array uzunligi manfiy bo'lmasligi kerak");
            return;
        }

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.printf("%d - sonni kiriting: ", i+1);
            array[i] = scanner.nextInt();
        }

        int counter = 0;
        for (int number : array) {
            if(number > 59) counter++;
        }
        System.out.println("counter = " + counter);
    }
}
