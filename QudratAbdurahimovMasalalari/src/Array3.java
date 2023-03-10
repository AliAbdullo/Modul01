import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int n = 7;
        int A = 2;
        int D = 3;
        System.out.println(Arrays.toString(add(n, A, D)));
    }

    private static int[] add(int n, int a, int d) {
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[0] = a;
            array[i] = array[i - 1] + d;
        }
        return array;
    }
}
