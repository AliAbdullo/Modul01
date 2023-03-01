import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask5V2 {
    public static void main(String[] args) {
        // 5. Kiritilgan satrdagi butun sonlarning yig'indisini aniqlash
        // Example: "Today is 28 th of February in 2023" => 28+2023 = ?

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        Scanner scanner = new Scanner(text);

        int sum = 0;
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                System.out.println("number = " + number);

                sum += number;

            }else{
                scanner.next();
            }
        }

        System.out.println("sum = " + sum);

        /*while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println("word = " + word);
        }*/
       /* while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("line = " + line);
        }*/
    }
}









