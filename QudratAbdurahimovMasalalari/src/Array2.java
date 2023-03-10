import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(Arrays.toString(kv(n)));

    }

    private static int[] kv(int n) {
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[0] = 1;
            arr[i] = arr[i - 1] * 2;
        }
        return arr;
    }
}
