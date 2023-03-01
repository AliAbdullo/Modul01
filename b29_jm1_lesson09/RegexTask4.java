import java.util.Scanner;

public class RegexTask4 {
    public static void main(String[] args) {
        // 4. Kiritilgan satrni avtomobil raqami ekanligini tekshiring,
        // agar u mashina raqami bo'lsa qaysi viloyatga tegishli ekanligini aniqlash

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter uz card number: ");
        String carNumber = sc.nextLine();

        boolean matches = carNumber.matches(
                "(\\d{2}[A-Z]\\d{3}[A-Z]{2})|(\\d{5}[A-Z]{3})");

        //System.out.println(matches);
        if (matches) {
            String regionIndex = carNumber.substring(0, 2);
            int regionNumber = Integer.parseInt(regionIndex);

            String region = null;
            if (regionNumber == 0) {
                region = "Invalid car number";
            } else if (regionNumber <= 9) {
                region = "Tashkent city";
            }
            else if (regionNumber <= 19) {
                region = "Tashkent region";
            }
            else if (regionNumber <= 24) {
                region = "Sirdarya region";
            }
            //..

            System.out.println("region = " + region);

        } else {
            System.out.println("Invalid car number");
        }
    }
}
