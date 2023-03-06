import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();

        showByEvenAndOddIndex(a);
    }

    static void showByEvenAndOddIndex(int[] a){
        int[] byEvenIndex = new int[a.length % 2 == 1 ? a.length / 2 + 1 : a.length / 2];
        int[] byOddIndex = new int[a.length / 2];

        int ei = 0, oi = 0;
        for (int i = 0; i < a.length; i++)
            if (i % 2 == 0)
                byEvenIndex[ei++] = a[i];
            else
                byOddIndex[oi++] = a[i];

        System.out.println(Arrays.toString(byEvenIndex));
        System.out.println(Arrays.toString(byOddIndex));
    }
}
