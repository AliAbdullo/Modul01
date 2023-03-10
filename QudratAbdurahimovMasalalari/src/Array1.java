import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
/*
        System.out.print("Nechta sondan iborat bo'lishi kerak: ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        System.out.println("Sonlarni joylang: ");
*/

        int[] array = {1, 7, 8, 9, 4, 5, 6, 15, 23, 45, 98, 22, 44, 55};

        System.out.println("Siz kiritgan toq sonlar = " + Arrays.toString(oddNums(array)));
    }

    static int[] oddNums(int[] f) {
        int counter = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 != 0) {
                counter++;
            }
        }
        int[] oddArray = new int[counter];
        int k = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 != 0) {
                oddArray[k++] = f[i];
            }
        }
        return oddArray;
    }
}
