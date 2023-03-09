public class Stars {
    public static void main(String[] args) {

        System.out.println(starsAdd("l|*|**|**|"));

    }

    private static int starsAdd(String s) {
        int countLine = 0;
        int countStar = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                if (countLine == 2)
                    countLine = 0;
                countLine++;
                continue;
            }
            if (countLine == 2) {
                if (s.charAt(i) == '*')
                    countStar++;
            }
        }
        return countStar;
    }
}
