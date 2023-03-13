import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(missingChar("BigBen", 3));
    }

    public static String missingChar(String str, int n) {
        String str2 = "";
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n) {
                i++;
            } else {

            }
        }
        return str2;
    }


}
