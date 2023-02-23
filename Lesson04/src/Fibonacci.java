import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resualt = fibo(5);
        System.out.println(resualt);
   /*     int fib1=task2(3);
        System.out.println(fib1);
*/
    }

    public static int fibo(int num) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num == 0 || num == 1) {
            return num;
        }
        if (num == 2) {
            return 1;
        }
        int fibo_first = 0;
        int fibo_second = 1;
        int current = 1;
        for (int i = 2; i < num; i++) {
            current = fibo_second + fibo_first;
            fibo_first = fibo_second;
            fibo_second = current;

        }
        return fibo_second;
    }
    static int task2(int n){
        if(n <= 1)
            return n;
        return task2(n-1) + task2(n-2);
    }
}
