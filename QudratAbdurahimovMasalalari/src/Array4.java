import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int len = 5;
        int oneElement = 3;
        int efficient = 2;
        System.out.println(Arrays.toString(multiplier(len, oneElement, efficient)));
    }

    private static int[] multiplier(int len, int oneElement, int efficient) {
        int[] array = new int[len];
        for (int i = 1; i < len; i++) {
            array[0] = oneElement;
            array[i] = array[i - 1] * efficient;
        }
        return array;
    }
}
