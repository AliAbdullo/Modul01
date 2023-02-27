public class PowerNumber {
    public static void main(String[] args) {
        System.out.println(power(5, 4));
    }

    private static int power(int number, int degree) {
        if (degree <= 0) return 1;
        return number * power(number, degree - 1);
    }
}
