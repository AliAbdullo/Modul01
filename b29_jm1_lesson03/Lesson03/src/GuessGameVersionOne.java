import java.util.Scanner;

public class GuessGameVersionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min number : ");
        int min = scanner.nextInt();
        System.out.println("Enter max number : ");
        int max = scanner.nextInt();
        int computer = (int) Math.round(Math.random()*(max-min)) + min;
        System.out.print("Enter  number : ");
        int guessNumber = scanner.nextInt();
        if(guessNumber == computer){
            System.out.println("Your win 👏👏👏");
        }else {
            System.out.println("Sorry You loose 😢😢😢");
        }
    }
}
