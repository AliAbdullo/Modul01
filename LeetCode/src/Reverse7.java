public class Reverse7 {
    public static void main(String[] args) {


        System.out.println(reverse(789));
    }

    public static int reverse(int x) {
        long res = 0;

        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) res;
    }
}
