import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//  3)	n ta elementdan tashkil topgan butun sonlar massivi berilgan. Toq indeksdagi elementlaridan alohida, juft indeksdagi elementlaridan alohida massivlar hosil qilib, ularni ekranga chiqaruvchi dastur tuzing.
//
//      Input: arr = [10, -2, 37, 45, -51, -60, 7]
//
//      Output: arrByOddIndex=[-2, 45, -60], arrByEvenIndex=[10, 37, -51, 7]

        int[] array = {10, -2, 37, 45, -51, -60, 7};


        oddEven(array);
    }

    private static void oddEven(int[] arr) {
        int counter1=0;
        int counter2=0;

        for (int i = 0; i < arr.length; i++) {
            if((i+1)%2==0){ counter1++;
            }else{
                counter2++;
            }
        }
        int[] arrByOddIndex = new int[counter1];
        int[] arrByEvenIndex = new int[counter2];

        for (int i = 0; i < arr.length; i++) {
            if((i+1)%2==0){
                arrByOddIndex[i]=i;
            }else {
                arrByEvenIndex[i]=i;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrByEvenIndex));
        System.out.println(Arrays.toString(arrByOddIndex));
    }
}
