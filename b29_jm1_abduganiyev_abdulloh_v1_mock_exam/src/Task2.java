import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//2)	Foydalanuvchi tomonidan butun sonlar kiritilaveradi. Bu jarayon klaviaturadan 0 (nol soni) kiritilguncha davom etadi.
//      Bunda kamida bitta noldan farqli son kiritiladi. Nol sonini inobatga olmagan holda kiritilgan sonlarning
//      eng kattasini va u necha marta kiritilganini aniqlovchi dastur tuzing.
//
//  Input: 10, 25, 10, -45, 6, 25, -100, 25, 8, 0m
//  Output: max=25, count=3
//
//  Input: -10, 0
//  Output: max=-10, count=1


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int max = num;
        int maxim = 1;

        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > max) {
                max = num;
                maxim = 1;
            } else if (num == max) {
                maxim++;
            }
        }
        System.out.println(max);
        System.out.println(maxim);
    }
}

