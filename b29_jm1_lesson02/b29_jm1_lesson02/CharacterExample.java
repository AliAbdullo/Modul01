import java.util.Arrays;

public class CharacterExample {
    public static void main(String[] args) {
        // char, Character
        char c = 'B';
        System.out.println("c = " + c);

        c = 66;
        System.out.println("c = " + c);

        c = '\u0042';
        System.out.println("c = " + c);

        c = 0x42;
        System.out.println("c = " + c);

        // 0-9 : 48..57
        // a-z : 97..122
        // A-Z : 65..90
        // space : 32

        System.out.println();

        /*for (char i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++) {
            System.out.println("i = " + i);
        }*/

        /*for (char i = 'a'; i < 'z'; i++) {
            System.out.println("i = " + i);
        }*/

//        Character.isLetter()
//        Character.isDigit()
//        Character.isLetterOrDigit()
//        Character.isUpperCase()
//        Character.isLowerCase()
//        Character.isHighSurrogate()
//        Character.isLowerCase()
//        Character.isSpaceChar()
//        System.out.println("Character.digit('F', 16) = " +
//                Character.digit('F', 16));
//        System.out.println("Character.digit('H', 16) = " +
//                Character.digit('H', 16));


        // 🤣 = "\uD83E\uDD23";
        // Surrogate
        int codePoint = 0x1f923;
        char hs = Character.highSurrogate(codePoint);
        char ls = Character.lowSurrogate(codePoint);
        char[] value = {hs, ls};
        System.out.println(value);

        System.out.println("\uD83E\uDD23");
        System.out.println("🤣");

        /*System.out.println(1+2+"number"+1+2);
        System.out.println((1+2)+"number"+(1+2));*/

        /*String firstName = "Nodir";
        int age = 19;

        System.out.println(firstName+age);
        System.out.println("Nodir"+19);
        System.out.println("Nodir"+"19");
        System.out.println("Nodir19");*/

    }
}
