import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
//
        int[] array = {12,32,445,78,98,625,23,45};

        int [][]table = new int[3][6];
        for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j <6; j++) {
                row[j] = (int) Math.round( Math.random()*100);
            }
        }
        for (int i = 0; i < 3; i++) {
            int[]row = table[i];
            for (int j = 0; j < 6; j++) {
                int element = row[j];
                System.out.print(element + "\t");
            }
            System.out.println("");
        }
//


 /*       String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if( i < array.length-1){
                str = str + ", ";
            }
        }
        str = str + "]";
        System.out.println(str);
*/







/*
        int[] array;
        array = new int[4];// new -> return memory address
        int index = 2;
        int nthElement = array[index];
        System.out.println(nthElement);
        Scanner scanner = new Scanner(System.in);
*/

        /*for (int i = 0; i < 4; i++) {
            System.out.print("array["+i+"] = ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }*/

//        int arrayLength = array.length;
/*
        array = new int[10];
        System.out.println(array.length);

//        int[] array2 = new int[]{3, 24, 5,67,90};
        int[] array2 = {3, 24, 5,67,90};
        for (int i=0; i< array2.length; i++){
            System.out.println(array2[i]);
        }
*/




    }
}
