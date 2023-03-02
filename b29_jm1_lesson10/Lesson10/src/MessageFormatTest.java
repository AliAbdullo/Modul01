public class MessageFormatTest {
    public static void main(String[] args) {
        System.out.println(String.format("%g", 33.1234567));
        System.out.println(String.format("%S",5646584) );
        System.out.println(String.format("%g", 33.1234567));
        System.out.println(String.format("%S",5464) );
        System.out.println(String.format("%g", 33.1234567));
        System.out.println(String.format("%c", 'a'));
        System.out.println(String.format("%h", "new Student(random)"));
        System.out.println(String.format("%b", null));
        System.out.println(String.format("%c", 'a'));
        System.out.println(String.format("%h", "fjedf"));
        System.out.println(String.format("%s", "Alish"));

        System.out.println(String.format("%b", true));
        System.out.println("String.format(\"%B\", false) = " + String.format("%B", false));
    }
}
