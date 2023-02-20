public class App {
    public static void main(String[] args) {
        int number = 2023;
        System.out.println();

        String numberInBinary = Integer.toBinaryString(number);
        System.out.println("numberInBinary = " + numberInBinary);

        String numberInBinaryFull = String.format("%32s", numberInBinary)
                .replace(" ", "0");
        System.out.println("numberInBinaryFull = " + numberInBinaryFull);

        System.out.println("numberInBinaryFull.charAt(29) = " +
                numberInBinaryFull.charAt(29));
    }
}
