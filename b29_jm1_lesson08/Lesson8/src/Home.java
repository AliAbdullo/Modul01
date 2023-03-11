import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sekundni kiriting: ");
        int sek = scanner.nextInt();

        hour(sek);
    }

    private static void hour(int sek) {
        int min = 0;
        int hour = 0;
        int sekund = 0;

        if ( sek>3600){
            hour = sek/3600;
            min = (sek-(hour*3600))/60;
            sekund= sek%60;
        }


        System.out.printf("%d-soat, %d-minut, %d-sekund",hour,min,sekund);
    }
}
