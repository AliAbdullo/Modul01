import java.util.Scanner;

public class RegexTask3 {
    public static void main(String[] args) {
        // 3. Kiritilgan satrni INN (9 talik raqam) raqami ekanligini tekshiring
        // INN (russian) = TIN (english)

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter TIN number: ");
        String tin = sc.nextLine();

        boolean matches=tin.matches("\\d{9}");

        System.out.println(matches);

    }
}
