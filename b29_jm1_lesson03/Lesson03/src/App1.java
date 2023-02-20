//import java.util.Scanner;

public class App1 {
    int groupNumber = 29; // instance var

    static int groupNumber2 = 29; // static var
    final int RANDOM_NUMBER = 850;

    public static void main(String[] args) {
        // java.util.Scanner -> fully qualified class name
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int groupNumber = 29; // local variable

        int b = 500;
        {
            System.out.println("b = " + b);
            int a = 10;
        }

        System.out.println("b = " + b);



    }
}










