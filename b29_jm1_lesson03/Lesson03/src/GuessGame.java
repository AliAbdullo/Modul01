import java.util.Scanner;

public class  GuessGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 2;
        int computer = (int) Math.round(Math.random()*(max-min)) + min;
        System.out.print("Enter number : ");
        int guessNumber = scanner.nextInt();
        if(guessNumber == computer){
            System.out.println("Your win 👏👏👏");
        }else {
            System.out.println("Sorry You loose 😢😢😢");
        }
    }

}
