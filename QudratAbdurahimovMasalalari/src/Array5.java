import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int len = 5;
        System.out.println(Arrays.toString(fibonaci(len)));
    }

    private static int[] fibonaci(int len) {
        int F1 = 1;
        int F2 = 1;
        int[] fibonacci = new int[len];
        fibonacci[0] = F1 + F2;
        fibonacci[1] = fibonacci[0] + F2;
        for (int i = 2; i < len; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
