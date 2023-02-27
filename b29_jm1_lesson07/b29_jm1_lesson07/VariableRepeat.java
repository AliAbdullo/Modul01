public class VariableRepeat {
    String variable = "abc";
    static String staticVariable = "def";

    public static void main(String[] args) {
        // variable shadowing
        String staticVariable = "defdefdef";
        System.out.println("staticVariable = " + staticVariable);
        System.out.println("VariableRepeat.staticVariable = " +
                                    VariableRepeat.staticVariable);

        String variable = "qwerty";
        System.out.println("variable = " + variable);

        VariableRepeat obj = new VariableRepeat();
        obj.nonStaticMethod();
    }

    void nonStaticMethod(){
        // variable shadowing
        String variable = "qwertyuiqwerty";

        System.out.println("variable = " + variable);
        System.out.println("this.variable = " + this.variable);
        System.out.println("staticVariable = " + staticVariable);
    }


    int methodOne(){
        int number = 25;
        // .....
        return number;
    }

    void methodTwo(){
        int number = 25;
        int age = 25;
    }
}