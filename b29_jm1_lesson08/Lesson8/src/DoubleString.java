public class DoubleString {
    public static void main(String[] args) {
        System.out.println(duplicate("The end"));
    }

    private static String duplicate(String s) {
        String dup = "";
        for (int i = 0; i < s.length(); i++) {
            dup += s.charAt(i);
            dup += s.charAt(i);
        }
        return dup;
    }
}
