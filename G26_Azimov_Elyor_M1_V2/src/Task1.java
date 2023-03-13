import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sekundni kiriting : ");
        int sekund = scanner.nextInt();
        if(sekund > 0) {
            sekundToHourAndMinutAndSecund(sekund);
        }
        else{
            System.out.println("0 va manfiy son kiritmang ");
        }

    }
    public static void sekundToHourAndMinutAndSecund(int sekund){ // 70 % 3600
        int hour = sekund / 3600;
        int minut =  (sekund - (hour * 3600)) / 60;
        int second = sekund % 60;
        System.out.println("soat : " + hour);
        System.out.println("minut : " + minut);
        System.out.println("sekund : " + second);
    }
}
