public class VariableTypesExample2 {
    public static void main(String[] args) {
        System.out.println("VariableTypesExample.staticVariable = "
                + VariableTypesExample.staticVariable);
        VariableTypesExample.staticVariable = 5000;
        VariableTypesExample.staticMethod();

        VariableTypesExample obj = new VariableTypesExample();
        // obj -> reference, instance, object
        obj.instanceORNonStaticMethod();
        obj.instanceVariable = 7000;
    }
}


