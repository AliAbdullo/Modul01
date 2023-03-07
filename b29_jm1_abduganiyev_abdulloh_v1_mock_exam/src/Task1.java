import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//1)	Kiritilgan satrdagi katta harflarni kichik harfga, kichik harflarni katta harfga almashtiradigan dastur tuzilsin.
//      Kiruvchi ma'lumot: Phyton
//      Chiquvchi ma'lumot: pHYTON

        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting: ");
        String word = scanner.nextLine();

        System.out.println(changeRegister(word));
    }

    private static String changeRegister(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                newWord = newWord.concat(Character.toLowerCase(word.charAt(i)) + "");
            } else if (Character.isLowerCase(word.charAt(i))) {
                newWord = newWord.concat(Character.toUpperCase(word.charAt(i)) + "");
            } else {
                newWord = newWord.concat(word.charAt(i) + "");
            }
        }
        return newWord;


/*
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) word.charAt(i);
            if(Character.isLowerCase(word.charAt(i))) lowerChars++;
            if(Character.isDigit(word.charAt(i)))     digitChars++;
        }
*/

    }
}
