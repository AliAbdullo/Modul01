import java.util.Scanner;

public class Parol {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.print("Parolni kiriting: ");
        String parol = kiritilgan.nextLine();
        int sanoq = 0;
        if (parol.matches(".*\\d.*")) sanoq++;
        if (parol.matches("[a-z].*")) sanoq++;
        if (parol.matches(".*[A-Z].*")) sanoq++;
        if (parol.matches(".*[!\"#$%&()*+,./;:=?_@>-].*")) sanoq++;

        if (sanoq > 2) {
            System.out.println("Parol to'g'ri kiritildi");
        } else {
            System.out.println("Parol talabga javob bermaydi, boshqa parol kiriting: ");
        }
    }
}
