public class Home3 {
    public static void main(String[] args) {
/*        3) Berilgan satrni palindromlikka tekshiruvchi method yozing
        Input: “uzum”:   Output: false
        Input: “aka”:      Output: true*/ // katak 0 5-1-0   1 5-1-1 3

        System.out.println("Chacking Palindrom = " + chackPalindrom("katak"));

    }

    private static boolean chackPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }return true;

    }
}
