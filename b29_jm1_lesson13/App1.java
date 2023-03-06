import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 7};
        int[] arr2 = {11, -54, 77, 8};

        int[] arrays = mergeArrays(arr1, arr2);
        System.out.println("arrays = " + Arrays.toString(arrays));
    }

    public static int[] mergeArrays(int[] a, int[] b){
        int[] res = Arrays.copyOf(a, a.length+b.length);

        System.arraycopy(b, 0, res, a.length, b.length);

        return res;
    }

/*    public static int[] mergeArrays(int[] a, int[] b){
        int[] res = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }

        for (int i = 0, j=a.length; j < res.length; i++, j++) {
            res[j] = b[i];
        }

        return res;
    }*/
}
