public class newCode {
    public static void main(String[] args) {
        System.out.println(counterCode("xxxcodecooe"));
    }

    public static int counterCode(String s) {
        int counter = 0;
        for (int i = 0; i < s.length() - 3; i++) {
            char c = s.charAt(i);
            char o = s.charAt(i + 1);
            char e = s.charAt(i + 3);
            if (c == 'c' && o == 'o' && e == 'e') {
                counter++;
            }
        }
        return counter;
    }
}
