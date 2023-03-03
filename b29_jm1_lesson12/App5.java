import java.util.Arrays;

public class App5 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};

        // shallow copy
        // int[] arr2 = arr1;

        // deep copy
        // int[] arr2 = arr1.clone();
        // int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        // int[] arr2 = Arrays.copyOf(arr1, 3);
        // int[] arr2 = Arrays.copyOf(arr1, 10);
         int[] arr2 = Arrays.copyOfRange(arr1, 1, 4);




        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        arr2[2]  = 777;

        System.out.println("\narr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println();
        int[] arr3 = {1, 2, 7, 47, 78, 45, 65};
        System.out.println("\narr3 = " + Arrays.toString(arr3));

        System.arraycopy(arr1, 1, arr3, 3, 3);
        System.out.println("\narr3 = " + Arrays.toString(arr3));


    }
}
