import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number");
        int number = scanner.nextInt();

        String sign = "";
        if(number < 0){
            sign = "minus ";
            number = -number;
        }

        if(number < 100 || number > 999){
            System.out.println("Wrong number");
            return;
        }

        int r1 = number%10;
        int r10 = number/10%10;
        int r100 = number/100;
        // 429 => to'rt yuz yigirma to'qqiz

        String[] oneRooms = {"", "bir", "ikki", "uch", "to'rt",
                            "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] tenRooms = {"", "o'n", "yigirma", "o'ttiz", "qirq",
                "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

        String str = oneRooms[r100]+ " yuz "+tenRooms[r10]+" "+oneRooms[r1];

        System.out.println(sign+str);

        System.out.println(sign+ReadNumberVersionTwo.readNumberWithThreeRoom(number));
    }
}
