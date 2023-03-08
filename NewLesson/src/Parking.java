import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = {
                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"}
        };
        while (true) {
            displayMenu();
            System.out.println("?:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> displayPark(matrix);
                case "2" -> availableCellsCount(matrix);
                case "3" -> notAvailableCellsCount(matrix);
                case "4" -> in(matrix);
                case "5" -> out(matrix);
                case "q" -> {
                    System.out.println("Bye ))");
                    System.exit(0);
                }
                default -> System.out.println("Wrong choice");
            }
        }
    }


    private static void availableCellsCount(String[][] matrix) {
        String emptySign = "✅";
        int counter = 0;
        for (String[] row : matrix) {
            for (String cell : row) {
                if (cell.equals(emptySign))
                    counter++;
            }
        }
        System.out.printf("Available Cells Count is : %5d%n", counter);
    }

    private static void notAvailableCellsCount(String[][] matrix) {
        String emptySign = "✅";
        int counter = 0;
        for (String[] row : matrix) {
            for (String cell : row) {
                if (!cell.equals(emptySign))
                    counter++;
            }
        }
        System.out.printf("Not Available Cells Count is : %5d%n", counter);
    }

    private static void in(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row index : ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter column index : ");
        int columnIndex = scanner.nextInt();
        if (matrix[rowIndex][columnIndex].equals("✅"))
            matrix[rowIndex][columnIndex] = "\uD83D\uDE95";
        else {
            System.out.println("Cell already taken 😒😒");
        }

    }

    private static void out(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row index : ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter column index : ");
        int columnIndex = scanner.nextInt();
        matrix[rowIndex][columnIndex] = "✅";
    }

    private static void quit() {

    }

    private static void displayMenu() {
        System.out.println("Display Park              -> 1");
        System.out.println("Available cells count     -> 2");
        System.out.println("Not Available cells count -> 3");
        System.out.println("In                        -> 4");
        System.out.println("Out                       -> 5");
        System.out.println("Quit                      -> q");
    }

    private static void displayPark(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.printf("%s\t", cell);
            }
            System.out.println();
        }
    }
}