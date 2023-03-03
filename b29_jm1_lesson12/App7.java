import java.util.Arrays;

public class App7 {
    public static void main(String[] args) {
        String[] students = {
                "Davron Xolmatov",
                "Amirov Shahzod",
                "Ergashev Nodir",
                "Ibrohim Hamidov",
                "Laziz Hamroyev"
        };

        System.out.println("students = " + Arrays.toString(students));

        /*for (int i = 0; i < students.length; i++) {
            String fullName = students[i];
            System.out.println("fullName = " + fullName);
        }*/

        for (String fullName : students){
            System.out.println("fullName = " + fullName);
        }
    }
}
