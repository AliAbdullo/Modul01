import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 9, 6, 4, 3, 7, 23, 5, 78, 98};
        System.out.println(Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array) {
        int[] arr = new int[array.length];
        int j = 0;// 12
        for (int i = array.length - 1; i >= 0; i--) {
            arr[j++] = array[i];
        }
        return arr;
    }
}
