public class VariableTypesExample {
    int instanceVariable = 100;
    static int staticVariable = 200;
    public static void main(String[] args) {
        int localVariable = 300;
    }

    static void staticMethod(){
        String localVariable = "Java";
        System.out.println("localVariable = " + localVariable);
        System.out.println("staticVariable = " + staticVariable);
        System.out.println("staticVariable = " +
                VariableTypesExample.staticVariable);
    }

    void instanceORNonStaticMethod(){
        String localVariable = "B29";
        System.out.println("localVariable = " + localVariable);
        System.out.println("instanceVariable = " + instanceVariable);
        System.out.println("staticVariable = " + staticVariable);
    }
}


