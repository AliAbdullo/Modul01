import java.util.Scanner;

public class KvPerimetri {
    public static void main(String[] args) {
        System.out.print("Kvadrat tomonini kiriting: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Kvadratning perimetri(P): " + preimetr(a));
    }

    private static int preimetr(int num) {
        int P = num * 4;
        return P;
    }
}
