import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sumOfNumbers(str));
    }

    static long sumOfNumbers(String str){

        long s = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num = num.concat(str.charAt(i) + "");

            else if (!num.equals("")) {
                s = s + Long.parseLong(num);
                num = "";
            }
        }

        if (!num.equals(""))
            s = s + Long.parseLong(num);

        return s;
    }
}
