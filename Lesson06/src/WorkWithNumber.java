import java.util.Scanner;

public class WorkWithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 4. Array berilgan.
            Unda har bir element 2 marta qatnashgan, faqat 1 ta elementdan tashqari.
            O'sha yakka elementni topish

            Input: [4, 8, 7, 8, 4], Output: 7
            Input: [14, 18, 17, 18, 17], Output: 17

            singleNumber(array: [14, 18, 17, 18, 17]) -> int : 14
        */

        int[] arr = {14, 18, 17, 18, 17};
        int result = singleNumber(arr);
        System.out.println("result = " + result);

    }

    private static int singleNumber(int[] arr) {
        for (int i: arr
             ) {

        }
        return 0;
    }
}
