import java.text.NumberFormat;

public class StringFormatExample {
    public static void main(String[] args) {
        double balance = 2e9d;
        System.out.println("balance = " + balance);
        System.out.printf("balance = %20.2f \n" , balance);
        System.out.printf("balance = %5.2f %n" , balance);
        System.out.printf("balance = %,5.2f %n" , balance);
        System.out.printf("balance = %5.2f %n" , balance);
        System.out.printf("balance = %020.2f \n" , balance);
        System.out.printf("balance = %-20.2f |\n" , balance);
        System.out.printf("balance = %20.2f |\n" , balance);

        // %[flag][width][.precision]conversationType
        // NumberFormat

        System.out.println();
        String message = String.format("balance = %,5.2f %n", balance);
        System.out.println(message.replace(",", " "));

    }
}
