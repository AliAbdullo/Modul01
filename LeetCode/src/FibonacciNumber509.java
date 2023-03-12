public class FibonacciNumber509 {
    public static void main(String[] args) {

        System.out.println(fibonacci(7));
    }

    private static int fibonacci(int n) {
        int F1 = 0;
        int F2 = 1;
        int Fn;
        for (int j = 1; j <= n; j++) {
            Fn = F1 + F2;
            F1 = F2;
            F2 = Fn;
        }
        return F1;
    }
}
