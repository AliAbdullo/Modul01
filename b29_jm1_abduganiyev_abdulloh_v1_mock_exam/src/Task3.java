import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
//  3)	n ta elementdan tashkil topgan butun sonlar massivi berilgan.
//      Toq indeksdagi elementlaridan alohida, juft indeksdagi elementlaridan alohida massivlar hosil qilib,
//      ularni ekranga chiqaruvchi dastur tuzing.
//
//      Input: arr = [10, -2, 37, 45, -51, -60, 7]
//
//      Output: arrByOddIndex=[-2, 45, -60], arrByEvenIndex=[10, 37, -51, 7]

        int[] array = {10, -2, 37, 45, -51, -60, 7};


        oddEven(array);
    }

    private static void oddEven(int[] arr) {

        int[] arrByOddIndex;
        int[] arrByEvenIndex;
        if (arr.length % 2 == 1) {
            arrByOddIndex = new int[arr.length / 2];
            arrByEvenIndex = new int[arr.length / 2 + 1];
        } else {
            arrByOddIndex = new int[arr.length / 2];
            arrByEvenIndex = new int[arr.length / 2];
        }
        int k = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arrByEvenIndex[k++] = arr[i];
            if (i % 2 == 1) arrByOddIndex[n++] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrByEvenIndex));
        System.out.println(Arrays.toString(arrByOddIndex));
    }
}
