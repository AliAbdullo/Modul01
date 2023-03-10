public class Array8 {
    public static void main(String[] args) {
        int[] massiv = {1, 3, 4, 6, 7, 89, 7, 5, 3, 2, 55, 9, 7, 5};
        odd(massiv);
    }

    private static void odd(int[] array) {
        int counter = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                counter++;
                System.out.printf(" %d", odd);
            }

        }

        System.out.printf(" toq sonlar = %d%n", counter);
    }
}
