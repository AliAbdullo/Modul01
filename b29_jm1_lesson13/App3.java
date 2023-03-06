public class App3 {
    int instanceVariable = 10;
    Integer instanceVariable2 = 10;
    // instance variable => HEAP

    static int staticVariable = 10;
    // static variable => Method Area

    public static void main(String[] args) {
        // codes of main() method => Method Area
        // called  main() method => load to stack

        int localVariable = 10;
        // primitive local variable => STACK => STACK FRAME

        Integer localVariable2 = 10;
        // non-primitive local variable  => STACK => STACK FRAME
        // non-primitive local variable value => HEAP

    }
}
