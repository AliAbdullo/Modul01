import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class App3 {
    public static void main(String[] args) {
       // Arrays, Objects, Collections, Math

/*        int[] arr = new int[10];
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.fill(arr, 100);
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.fill(arr, 2, 6, 50);
        System.out.println("arr = " + Arrays.toString(arr));*/

/*        System.out.println("***");
        Integer[] arr1 = {17, 47, 87, 78, 85, 14, 8, 5, 9, 87, 5};
        System.out.println("\narr1 = " + Arrays.toString(arr1));

        // Arrays.sort(arr1);
        // Arrays.sort(arr1, 3, 8);
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("arr1 = " + Arrays.toString(arr1));*/

        int[] arr2 = {17, 47, 87, 78, 85, 14, 8, 5, 9, 87, 5};

        Arrays.sort(arr2);
        System.out.println("arr2 = " + Arrays.toString(arr2));

        // int index = Arrays.binarySearch(arr2, 14); // with only sorted arrays
        int index = Arrays.binarySearch(arr2, 140); // with only sorted arrays
        System.out.println("index = " + index);

    }
}
