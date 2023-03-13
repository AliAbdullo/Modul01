import java.util.Scanner;

public class RomanToInteger13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rim raqamini kiriting: ");
        String rimRaqam = scanner.nextLine();

//        System.out.println(Arrays.toString(romanToInt("III")));
    }
//    public static int romanToInt(String str){
//
//    }

 /*   public int romanToInt(String s) {
        int ans = 0;
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for (int i = 0; i + 1 < s.length(); ++i)
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
                ans -= roman[s.charAt(i)];
            else
                ans += roman[s.charAt(i)];

        return ans + roman[s.charAt(s.length() - 1)];
    }*/


/*    private static void romanToInteger(String rimRaqam) {
        int ans = 0, num = 0;
        for (int i = rimRaqam.length() - 1; i >= 0; i--) {
            switch (rimRaqam.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        System.out.println(ans);
    }*/
}
