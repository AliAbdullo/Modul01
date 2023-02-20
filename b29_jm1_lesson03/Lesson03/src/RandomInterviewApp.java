import java.util.Scanner;

public class RandomInterviewApp {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int studentIndex = random.nextInt(students.length);
            String student = students[studentIndex];
            System.out.println("student = " + student);

            while (true){
                int questionIndex = random.nextInt(questions.length);
                String question = questions[questionIndex];
                System.out.println("question = " + question);

                System.out.println("t/f");
                String str = scanner.nextLine();

                if (str.equals("t")) break;
            }
        }
    }


    static String[] students = {"Abdulloh Abduganiyev", "Bilol Aliqo'ziev",
            "Alisher Farxodov", "Bahodir Pardaboyev",
            "Doniyorjon Davlataliyev", "Davron Xolmatov",
            "Doston Roziqov", "Nodir Ergashev", "Ibrohim Hamidov",
            "Laziz Hamroyev", "Madiyor  Norboyev",
            "Muhammadbek Arslonbekov", "Nodir Norov",
            "Nodir Fayzullayev", "Sardor Murodov",
            "Sevinch  Muhammadiyeva", "Sunnatillo Salomov",
            "O'rol  Xudoynazarov", "Jamshid  Baxtiyorov"};

    // Put cursor to many places: Alt+Shift+Cursor
    static String[] questions = {
            "Java-da Operator nima ?",
            "Operandlar soniga qarab Operatorlar nechi turga bo'linadi ?",
            "Unary operator nima ?",
            "Binary operator nima ?",
            "Ternary operator nima ?",
            "Expression nima ?",
            "Java-da named operator nima ?",
            "Java-da Arithmetic operator nima ?",
            "Java-da Arithmetic operationlarni priotiry levellar qanday ?",
            "Java-da Relational operatorlar nima?",
            "Java nechta turdagi Relation operatorlarni qo'llab quvvatlaydi ?",
            "Java-da Logical operatorlar nima ?",
            "Java nechta turdagi Logical operatorlarni qo'llab quvvatlaydi ?",
            "Java-da Assignment operator nima ?",
            "x += y va x = x + y expressionlari o'rtasida farq bormi?"
    };


}
