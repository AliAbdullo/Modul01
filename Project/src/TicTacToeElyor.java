import java.util.Random;
import java.util.Scanner;

public class TicTacToeElyor {
    public static void main(String[] args) {


        class Main {

            static String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
            static int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            static int enterNumber1;
            static int enterNumber2;


            public static void main(String[] args) {
                while (true) {
                    int num = GameOfXAnd0.menu();
                    if (num != 1)
                        break;

                }


            }


            public static int enterTheFirstGamer() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("✖  harf o'yinchisi  joylashish kordinatasini kiritng ➡  ");
                enterNumber1 = scanner.nextInt();

                return enterNumber1;

            }

            public static int enterTheSecondGamer() {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" 0️⃣ raqam o'yinchi joylashish kordinatasini kiriting ➡ ");
                enterNumber2 = scanner.nextInt();
                return enterNumber2;


            }

            public static void arrayTheGame() {

                System.out.println("|---|---|---|");
                System.out.println("| " + array[0] + " | "
                        + array[1] + " | " + array[2]
                        + " |");
                System.out.println("|-----------|");
                System.out.println("| " + array[3] + " | "
                        + array[4] + " | " + array[5]
                        + " |");
                System.out.println("|-----------|");
                System.out.println("| " + array[6] + " | "
                        + array[7] + " | " + array[8]
                        + " |");
                System.out.println("|---|---|---|");

            }


            public static boolean randomGamer() {
                Random random = new Random();
                boolean randomGamer = random.nextBoolean();
                return randomGamer;
            }

            public static void secondGamerMetods() {
                for (int i = 1; i <= 1; i++) {
                    Main.arrayTheGame();
                    Main.enterTheSecondGamer();
                    if (Main.enterNumber2 >= 0 && Main.enterNumber2 <= 9) {
                        if (array2(Main.enterNumber2)) {
                            Main.array[Main.enterNumber2 - 1] = "0";

                        } else {
                            System.out.println("No'to'gri raqam kiritdingiz 🚫❗ ");
                            i--;
                        }
                    } else {
                        System.out.println("1️⃣  va 🔟 oraligida son kiriting : ");
                        i--;
                    }
                }

            }

            public static void firstGamerMetods() {
                for (int i = 1; i <= 1; i++) {
                    arrayTheGame();
                    enterTheFirstGamer();
                    if (enterNumber1 > 0 && enterNumber1 <= 9) {
                        if (array2(enterNumber1)) {
                            array[enterNumber1 - 1] = "X";
                        } else {
                            System.out.println("No'to'gri raqam kiritdingiz 🚫❗ ");
                            i--;
                        }
                    } else {
                        System.out.println("️1️⃣  va 🔟 oraligida son kiriting : ");
                        i--;
                    }
                }
            }

            public static boolean isWinnerX() {

                boolean isEqual = ((array[0].equals("X") && array[1].equals("X") && array[2].equals("X"))
                        || (array[2].equals("X") && array[5].equals("X") && array[8].equals("X"))
                        || (array[1].equals("X") && array[4].equals("X") && array[7].equals("X"))
                        || (array[0].equals("X") && array[3].equals("X") && array[6].equals("X"))
                        || (array[3].equals("X") && array[4].equals("X") && array[5].equals("X"))
                        || (array[6].equals("X") && array[7].equals("X") && array[8].equals("X"))
                        || (array[0].equals("X") && array[4].equals("X") && array[8].equals("X"))
                        || (array[2].equals("X") && array[4].equals("X") && array[6].equals("X")));
                return isEqual;
            }

            public static boolean isWinner0() {
                boolean isEqual0 = ((array[0].equals("0") && array[1].equals("0") && array[2].equals("0"))
                        || (array[2].equals("0") && array[5].equals("0") && array[8].equals("0"))
                        || (array[1].equals("0") && array[4].equals("0") && array[7].equals("0"))
                        || (array[0].equals("0") && array[3].equals("0") && array[6].equals("0"))
                        || (array[3].equals("0") && array[4].equals("0") && array[5].equals("0"))
                        || (array[6].equals("0") && array[7].equals("0") && array[8].equals("0"))
                        || (array[0].equals("0") && array[4].equals("0") && array[8].equals("0"))
                        || (array[2].equals("0") && array[4].equals("0") && array[6].equals("0")));
                return isEqual0;
            }

            public static boolean array2(int number) {
                boolean isNotEqual = false;
                if (Main.array2[number - 1] == number) {
                    Main.array2[number - 1] = 0;
                    isNotEqual = true;
                }
                return isNotEqual;
            }

            public static void theRandomPalayerIsX() {
                System.out.println("O'yinni  ✖ o'yinchi boshlaydi :  ");

                for (int i = 1; i <= 5; i++) {

                    firstGamerMetods();
                    if (isWinnerX()) {
                        System.out.println(" ❌ harfli  o'yinchi yutdi 🥇 : ");
                        break;
                    }
                    if (i == 5) break;
                    secondGamerMetods();
                    if (isWinner0()) {
                        System.out.println("0️⃣ raqam  o'yinchisi  yutdi 🥇 : ");
                        break;
                    }
                }
            }

            public static void theRandomPlayerIs0() {
                System.out.println("O'yinni  0️⃣ o'yinchi boshlaydi :  ");

                for (int j = 1; j <= 5; j++) {
                    secondGamerMetods();
                    if (isWinner0()) {
                        System.out.println("0️⃣ raqam o'yinchisi yutdi 🥇 : ");
                        break;
                    }

                    if (j == 5) break;
                    firstGamerMetods();
                    if (isWinnerX()) {
                        System.out.println(" ❌ harf o'yinchi yutdi 🥇 : ");
                        break;
                    }
                }
            }

            static class GameOfXAnd0 {
                public static void startGame() {
                    System.out.println("Bizning o'yinga xush kelibsiz : ");
                    System.out.println(" O'yin nomi : X va O ");
                }

                public static void aboutTheGame() {
                    System.out.println(" O'yin G26 guruhining 'Team - 3' jamoasi tomonidan yaratildi : ");
                    System.out.println("O'yin qoidalari :");
                    System.out.println("1. O'yinda ishtirokchi random tomonidan aniqlanadi va 1 - bo'lib shu o'yinchi o'yinni boshlaydi : ");
                    System.out.println("2.Sizga 9 ta raqamlangan kordinatalar beriladi va siz raqamlarni takrorlamasdan kordinatalarni kiritasiz.");
                    System.out.println("3.kiritilgan kordinatalar 0 va 10 oraligida (0 va 10 kirmaydi) bo'lishi kerak ");
                    System.out.println("4.O'yinda 8 xil yo'nalishdan biriga mos kelinsa ishtirokchi galaba qozonadi : ");
                }

                public static int choiceTheGameMenu() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("1 O'yinni boshlash  ");
                    System.out.println("2.O'yin haqida ");
                    int choiceTheMenu = scanner.nextInt();

                    return choiceTheMenu;
                }

                public static int menu() {
                    int choice = 0;
                    boolean choiceTheNumber;

                    do {
                        Scanner scanner = new Scanner(System.in);
                        GameOfXAnd0.startGame();
                        int number = GameOfXAnd0.choiceTheGameMenu();
                        if (number == 1) {
                            if (Main.randomGamer()) {
                                theRandomPalayerIsX();
                            } else theRandomPlayerIs0();

                            if (!(isWinner0() || isWinnerX())) {
                                System.out.println("Durrang 🤜🤛 natija qayd etildi : ");
                            }
                            Main.arrayTheGame();
                            System.out.println("Siz yana oynashni xoxlaysizmi ");
                            System.out.println("1.HA ✔");
                            System.out.println("Yo'q - istalgan raqam  ❌: ");
                            choice = scanner.nextInt();
                            String[] cloneTheArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                            Main.array = cloneTheArray;
                            int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                            Main.array2 = massiv;
                        } else if (number == 2) {
                            GameOfXAnd0.aboutTheGame();
                        } else {
                            System.out.println("No'to'gri raqam kiritdingiz ❗ ");
                        }
                        choiceTheNumber = choice == 1 || choice == 2;
                    }
                    while (!choiceTheNumber);

                    System.out.println("Bizning xizmatlardan foydalanganingiz uchun Rahmat 👋🙌👍 ");
                    return choice;
                }


            }
        }
    }
}
