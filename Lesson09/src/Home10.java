import java.util.Scanner;

public class Home10 {
    public static void main(String[] args) {
/*        10) Berilgan parolning yaroqli ekanligini tekshiring, bunda parol yaroqli hisoblanadi agar quyidagi shartlarni qanoatlantirsa:
        uzunligi 8 tadan 16 tagacha bo’lishi kerak
        kamida bitta katta harf qatnashishi kerak
        kamida bitta kichik harf qatnashishi kerak
        kamida bitta raqam qatnashishi kerak
        kamida bitta “!.@#$%^&*_” shu belgilardan biri qatnashishi kerak*/


        Scanner kiritilgan = new Scanner(System.in);


        chackPassword();

    }

    private static void chackPassword() {
        Scanner kiritilgan = new Scanner(System.in);
        boolean sanoqlar;
        int sanoq = 0;
        do {
            System.out.print("Parolni kiriting: ");
            String parol = kiritilgan.nextLine();
            if (parol.matches("[0-9]{16}")) sanoq++;
            if (parol.matches(".*[A-Z].*")) sanoq++;
            if (parol.matches("[a-z].*")) sanoq++;
            if (parol.matches("!.@#$%^&*_")) sanoq++;
            sanoqlar = sanoq > 2;
            System.out.println("Parol talabga javob bermaydi, boshqa parol kiriting: ");

    }while(!(sanoq >2));

        System.out.println("Parol togtri kiritildi ");
}
    }


