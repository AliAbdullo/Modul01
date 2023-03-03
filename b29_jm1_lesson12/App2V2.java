import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App2V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            // System.out.printf("arr[%d] = ", i);
            // arr[i] = scanner.nextInt();
            arr[i] = new Random().nextInt(101);
        }

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("***");
        //int[] result = getArrayWithOddNumbers(new int[]{11,21, 31, 10, 10, 40, 75});
        int[] result = getArrayWithOddNumbers(arr);
        System.out.println("result = " + Arrays.toString(result));
    }

    static int[] getArrayWithOddNumbers(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0){
                arr[j++] = arr[i];
            }
        }

        if(j == arr.length) return arr;

        return Arrays.copyOf(arr, j);
    }

/*    static int[] getArrayWithOddNumbers(int[] arr) {
        if (arr == null || arr.length == 0) return new int[]{};

        int[] res = new int[arr.length];
        int i = 0;

        for (int element : arr) {
            if (element % 2 != 0) {
                res[i++] = element;
            }
        }

        return Arrays.copyOf(res, i);
    }*/


    /*static int[] getArrayWithOddNumbers(int[] arr) {
        if (arr == null || arr.length == 0) return new int[]{};

        int counter = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                counter++;
            }
        }

        int[] res = new int[counter];
        int i = 0;

        for (int element : arr) {
            if (element % 2 != 0) {
                res[i++] = element;
            }
        }

        return res;
    }
*/

}
