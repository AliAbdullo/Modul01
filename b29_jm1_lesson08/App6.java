import java.util.Random;

public class App6 {
    public static void main(String[] args) {

        // Generate random password
        int len = getRandomNumberInRange(6, 16);

        String password = "";
        for (int i = 0; i < len; i++) {
            password = password + getRandomChar();
        }
        System.out.println("password = " + password);
    }

    private static char getRandomChar() {
        // 0- upper: 'A'-'Z'
        // 1- lower: 'a'-'z'
        // 2- digit: '0'-'9'
        // 3- other chars: "!@#$%^&*:.?<>_-"

        String otherChars = "!@#$%^&*:.?<>_-";

        Random random = new Random();
        int typeChar = random.nextInt(4);

        return switch (typeChar){
            case 0 -> (char)getRandomNumberInRange('A', 'Z');
            case 1 -> (char)getRandomNumberInRange('a', 'z');
            case 2 -> (char)getRandomNumberInRange('0', '9');
            default -> otherChars.charAt(getRandomNumberInRange(0, otherChars.length()-1));
        };
    }

    public static int getRandomNumberInRange(int min, int max) {
        return new Random().nextInt(min, max+1);
    }
}
