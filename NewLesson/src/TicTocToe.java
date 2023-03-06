import java.util.Random;

public class TicTocToe {
    static String chooseTurn(){
        Random random =new Random();
        return random.nextBoolean() ? "X" : "0";
    }

    static String[] fillBoard(){
        String[] strings = new String[10];
        for (int i=0; i<10; i++){
            strings[i]= String.valueOf(i);
        }
        return strings;
    }
    public static void main(String[] args) {

        String[] board = fillBoard();
        String turn = chooseTurn();
        printBoard(board);
    }

    private static void printBoard(String[] board) {
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("---------");
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println("---------");
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
    }
}
