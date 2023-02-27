public class SwapNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] arr2 = swapNumbers(a, b);
        a = arr2[0];
        b = arr2[1];

        System.out.println("\na = " + a);
        System.out.println("b = " + b);
    }

    private static int[] swapNumbers(int t, int b) {
        return new int[]{b, t};
    }
}
