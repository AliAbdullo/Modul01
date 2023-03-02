public class SFExample3 {
    public static void main(String[] args) {
        String[][] dictionary = {
                {"apple", "book"},
                {"man", "erkak"},
                {"woman", "ayol"},
                {"apartment", "kvartira"}
        };

        System.out.printf("%-10s | %s %n", "english", "uzbek");
        System.out.println();
        for (int i = 0; i < dictionary.length; i++) {
            System.out.printf("%-10s | %s %n", dictionary[i][0], dictionary[i][1]);
        }
    }
}
