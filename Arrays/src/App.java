import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nechta o'quvchi imtixonda qatnashdi: ");
        System.out.print("n= ");
        int n= scanner.nextInt();
        int[] sum = new int[n];
        System.out.println(sum);

//        System.out.print("Imtioxon natijalarini kiriting: ");
//        sum = new int[]{scanner.nextInt()};
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Arrayning "+(i+1)+"-elementini kiriting: ");
            sum[i] = scanner.nextInt();
        }
        int counter=0;
        System.out.println("Arrayning elementlari: ");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+ " ");
            if (sum[i]>59){
                counter++;
            }
        }
        System.out.println();

        System.out.println("Arrayning "+59+" dan katta "+counter+" ta son bor!");
    }
}
