public class App2 {
    public static void main(String[] args) {
        int value = 10 + 20;
        // 10, 20 - operands
        // "+" - operator => Binary Operator

        boolean t = 5 > 3;
        // 5, 3 - operands
        // ">" - operator => Binary Operator

        boolean t1 = !true;
        // true - operand
        // "!" - operator => Unary operator

        int d = +5; // => Unary operator

        // "-" - subtract, minus
        // "+" - addition, plus
        // ()[]{} - addition, plus
        System.out.println("pdp");
        System.out.println(10);
        System.out.println('(');

        int m = 10 + (2 * 9);
        System.out.println(m());

        System.out.println("(17.25%4) = " + (17.25 % 4));
        System.out.println("(-5%3) = " + (-5 % 3));

        System.out.println("(m%2==0) = " + (m % 2 == 0)); // true
        System.out.println(m() % 2 != 0); // false

        System.out.println();

        // 20 = 00000000 00000000 00000000 00010100
        // 20 >> 1 = 000000000 00000000 00000000 0001010
        System.out.println(20 >> 1);
        System.out.println(20 >>> 1);

        System.out.println();

        // starts with 0 => positive
        // starts with 1 => negative
        // 01.....
        System.out.println(-20 >> 1);
        System.out.println(-20 >>> 1);

        System.out.println();

        System.out.println("(2023 >> 3) = " + (2023 >> 3));
        System.out.println("(2023 << 3) = " + (2023 << 3));

        System.out.println();
        int number = 2023;

        String numberInBinary = Integer.toBinaryString(number);
        System.out.println("numberInBinary = " + numberInBinary);

        String numberInBinaryFull = String.format("%32s", numberInBinary)
                                    .replace(" ", "0");
        System.out.println("numberInBinaryFull = " + numberInBinaryFull);

        System.out.println("numberInBinaryFull.charAt(29) = " +
                numberInBinaryFull.charAt(29));

        System.out.println("\n".repeat(10));
    }

    private static int m() {
        return 1001;
    }
}
