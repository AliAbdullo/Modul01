public class FindTheIndex28 {
    public static void main(String[] args) {
        String word = "pofiefipoofien";
        String word2 = "poo";
        System.out.println(findTheIndex(word, word2));
    }

    private static int findTheIndex(String s1, String s2) {
        return s1.indexOf(s2);
    }
}
