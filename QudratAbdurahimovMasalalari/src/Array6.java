import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {

        int n = 5;
        int A = 5;
        int B = 2;
        System.out.println(Arrays.toString(fac(n, A, B)));
    }

    private static int[] fac(int n, int a, int b) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}
