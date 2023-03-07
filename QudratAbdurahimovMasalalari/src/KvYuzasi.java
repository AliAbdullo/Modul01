import java.util.Scanner;

public class KvYuzasi {
    public static void main(String[] args) {
        System.out.print("Kvadrat tomonini kiriting: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Kvadratning yuzasi() = " + kvYuzasi(a));
    }

    private static int kvYuzasi(int num) {
        int yuza = num * num;
        return yuza;
    }
}
