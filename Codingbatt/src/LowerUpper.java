public class LowerUpper {
    public static void main(String[] args) {
        String str = "FlaG";

        if (isUpperCase(str)) {
            System.out.println(true);
        }


    }

    static boolean isPascalCase(String a) {
        int l = a.length();
        if (Character.isLowerCase(a.charAt(0))) return false;
        for (int i = 1; i < l; i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isUpperCase(String a) {
        int l = a.length();
        for (int i = 0; i < l; i++) {
            if (Character.isLowerCase(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isLowerCase(String word) {
        int l = word.length();
        for (int i = 0; i < l; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
