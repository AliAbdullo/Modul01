import java.util.Scanner;

public class MashinalarXarakati {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);

        System.out.print("1-mashinaning tezligini kiriting: ");
        double tezlik1 = kirit.nextDouble();

        System.out.print("2-mashinaning tezligini kiriting: ");
        double tezlik2 = kirit.nextDouble();

        System.out.print("Umumiy masofani kiriting: ");
        double umumiyMasofa = kirit.nextDouble();

        double masofa1 = (tezlik1 * umumiyMasofa) / (tezlik1 + tezlik2);
        double masofa2 = umumiyMasofa - masofa1;
        
        double time = masofa1 / tezlik1;
        System.out.println("time = " + time);
        System.out.println("1-mashina bosib o'tgan masofa = " + masofa1);
        System.out.println("2-mashina bosib o'tgan masofa = " + masofa2);

    }
}
