import java.util.Scanner;

public class ArrayInputExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        int result = sum(array);
        System.out.println("result = " + result);
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int count8(int n) {

        // recursive

        if(n==0) return 0;

        return (n%10==8 ? 1 : 0)+count8(n/10);

    }
}
