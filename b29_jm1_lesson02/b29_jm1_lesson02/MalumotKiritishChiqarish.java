import java.util.Scanner;

public class MalumotKiritishChiqarish {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        //String uchun
        System.out.print("String malumot turida kiriting: ");
        String matnliMalumot = kiritish.nextLine();
        // Integer uchun
        System.out.print("Integer ma'lumot turida kiriting: ");
        int sonliMalumot = kiritish.nextInt();
        // Double uchun
        System.out.print("Double ma'lumot turida kiriting: ");
        double xaqiyqiySonliMalumot = kiritish.nextDouble();
        // Natijalar:
        System.out.println("String= "+matnliMalumot);
        System.out.println("Int"+sonliMalumot);
        System.out.println("Double"+xaqiyqiySonliMalumot);
    }
}
