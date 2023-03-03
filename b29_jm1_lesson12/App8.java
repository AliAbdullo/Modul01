import java.util.Arrays;

public class App8 {
    public static void main(String[] args) {

        int n = 70;

        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i < primes.length; i++) {
            for (int j = 2;  j * i <= n && primes[i]; j++) {
                System.out.println("i = " + i);
                primes[i * j] = false;
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println("i = " + i);
            }
        }


    }
}
