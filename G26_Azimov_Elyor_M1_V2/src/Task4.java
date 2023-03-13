import java.util.ArrayList;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
         int [] massiv = {1,1,5,5,10,8,7};
        System.out.println(sumOfPrimeNUmbers(massiv));

    }
    public static int sumOfPrimeNUmbers(int[] number){

        int sum = 0;
        int counter = 0;
        for(int i = 0; i < number.length; i++){

            if(isPrimeNumber(number[i])){
              counter++;
                sum += number[i];
            }
        }
        int [] massiv = new int[counter];
        int k = 0;

        for(int i = 0; i < number.length; i++){
            if(isPrimeNumber(number[i])){
             massiv[k++] = number[i];
            }
        }
        for(int i = 0; i < massiv.length-1; i++){
            for(int j = i +1; j< massiv.length; j++){
                if(massiv[i] == massiv[j]){
                    sum-= massiv[i];
                    break;
                }
            }
        }


        return sum;
    }
    public static boolean isPrimeNumber(int n){
        if(n == 0 || n == 1) return false;
        for (int i = 2 ; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
