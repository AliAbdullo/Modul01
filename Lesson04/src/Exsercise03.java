import java.util.Scanner;

public class Exsercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int resualt = task(num);
        System.out.println(resualt);

    }

    public static int task(int num) {
        if (num == 0||num == 1) {
            return num;
        }
        if (num == 2) {
            return 1;
        }
        int fibo_first = 0;
        int fibo_second =1;
        int current = 1;
        for (int i = 2; i < num; i++) {
            current=fibo_second+fibo_first;
            fibo_first = fibo_second;
            fibo_second= current;

        }return current;
    }
}
