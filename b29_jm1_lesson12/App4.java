import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {7, 77, 777}; // 0x123
        method1(a, arr);
        System.out.println("a = " + a); // 10
        System.out.println("arr = " + Arrays.toString(arr)); // 7 7000 777
    }

    private static void method1(int a, int[] nums) // arr= 0x123
    {
        a = 200;
        nums[1] = 7000;
    }
    // JAVA PASS BY VALUE
    // Java don't support pass by reference
}
