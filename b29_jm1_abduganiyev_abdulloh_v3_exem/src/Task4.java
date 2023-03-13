/**
 * @author Abduganiyev Abdulloh
 * @time 13/03/2023  10:15
 * @description This is class used to is small number count
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {-10, 0, -4, -2, -10, -10, -4, -2, -10};
        int[] array2 = {1, 2, 3, 4, 100};
        int[] array3 = {18, 10, 5, 5, 10, 8, 7};

        System.out.println(isSmallNumber(array3));

    }

    /**
     * @param arr
     * @return small number count
     * @description This is method used to is number small count
     */
    private static int isSmallNumber(int[] arr) {
        int len = arr.length;
        int min = arr[0];
        int counter = 0;
        for (int i = 1; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] == min) {
                counter++;
            }
        }
        return counter;
    }
}
