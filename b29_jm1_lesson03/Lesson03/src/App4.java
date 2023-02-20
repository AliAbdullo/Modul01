public class App4 {
    public static void main(String[] args) {
        int x = 20, y = 2;

        System.out.println("x = " + x+"\t y = "+y);

//        x = y++; // x = y; y++;
//        x = ++y;
//        x = y--;
        x = --y;

        System.out.println("x = " + x+"\t y = "+y);
    }
}
