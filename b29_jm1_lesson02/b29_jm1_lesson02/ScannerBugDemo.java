import java.util.Scanner;
public class ScannerBugDemo {
    public static void main(String[] args) {

        // get character from scanner
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);

        System.out.println("Enter class character");
//        String text = scannerStr.next();
        String text = scannerStr.nextLine();

        System.out.println("text = " + text.charAt(0));

        System.out.println("Enter your age");
        while (true){
            if(scannerNum.hasNextInt()){
                int age = scannerNum.nextInt();
                System.out.println("age = " + age);
                break;
            }else{
                scannerNum.next();
            }
        }
        /*if(scannerNum.hasNextInt()){
            int age = scannerNum.nextInt();
            System.out.println("age = " + age);
        }else{
            System.out.println("this isn't integer number");
        }*/


        System.out.println("Enter name");

        // scanner = new Scanner(System.in);
        // scanner.nextLine();

//        String name = scannerStr.nextLine();
        String name = new Scanner(System.in).nextLine();
        System.out.println("name = " + name);

    }
}
