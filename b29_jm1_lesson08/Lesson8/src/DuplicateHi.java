public class DuplicateHi {
    public static void main(String[] args) {
        System.out.println(counterHi("Jerry hi, hi hi hi"));
    }

    private static int counterHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                counter++;
            }
        }
        return counter;
    }
}
