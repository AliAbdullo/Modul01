import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
         Berilgan butun x1,x2,...,xn sonlarga bog'liq bo'lgan
         x1(x2+x3)(x4+x5+x6)...(x46+x47+...+x55) ifoda qiymatini
         hisoblansin.
        */
        int n = 18;
        int[] x = new int[n + 1];

        for (int i = 1; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10);
        }

        System.out.println("x = " + Arrays.toString(x));

        int multiply = 1;

        for (int i = 1, count = 1; i < x.length; i++, count++) {
            int sum = 0;
            int j = i;

            for (int k = 1; j < x.length && k <= count; j++, k++) {
                sum += x[j];
            }

            System.out.println("sum = " + sum);

            multiply *= sum;
            i = j - 1;
        }

        System.out.println("multiply = " + multiply);

    }
}
