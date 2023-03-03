import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        // Array: dataType, length, [reference]

        int[] arr1 = new int[20]; // default 0
        boolean[] arr2 = new boolean[20]; // default false
        char[] arr3 = new char[20]; // default '\u0000'
        String[] arr4 = new String[20]; // default  null

        int[] arr5 = {78, 80, 90, 50, 60, 47};
        int[] arr6 = new int[]{78, 80, 90, 50, 60, 47};
        int arr7[] = new int[]{78, 80, 90, 50, 60, 47};

        // int [] a, b; // a, b -> array
        // int a, b []; // a -> variable, b -> array

        System.out.println("access elements");

        System.out.println("arr5.length = " + arr5.length);

        for (int i = 0; i < arr5.length; i++) {
            //arr5[i] = 200; // change array's element
            System.out.printf("arr5[%d] = %d %n", i, arr5[i]);
        }

        System.out.println("\n for each element (only read)");
        for(int value : arr5){
            value = 200; // not change array's element
            System.out.println("value = " + value);
        }

        System.out.println("arr5 = " + Arrays.toString(arr5));
    }
}
