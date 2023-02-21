import java.util.Random;
import java.util.Scanner;

public class MathBattle {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

            int num1 = random.nextInt(1,10);
            int num2 = random.nextInt(10);
            char[] operators ={'+','-','*','/'};
            int index = random.nextInt(3);
            int i = random.nextInt(1);


            int Operator1 = num1 + num2;
            int operator2 = num1 - num2;
            int operator3 = num1 * num2;
            int operator4= num1 / num2;
            int[] question = {Operator1, operator2, operator3,operator4};
            int randomNumber = random.nextInt(1,5);
            int res = randomNumber + question[index];





            if (i == 1) {
                System.out.println(num1 +" " + operators[index] + " " + num2+ " = " + question[index]);

            }else {
                System.out.println(num1 + " " + operators[index] + " " + num2 + " = " + res);
            }
            System.out.println("To'grimi yoki noto'g'ri tanlang ( to'g'ri 0/1 noto'g'ri )");
            System.out.println("1. 2- variant to'gri  ");

            int resualt = scanner.nextInt();
            if(resualt == 0){
                System.out.println("correct");
            }
            else{
                System.out.println("incorrect");
            }

    }
}
