public class App1 {
    public static void main(String[] args) {
//        String =>
//        declare: LITERAL and new String("...")

        String str1 = "PDP";
        String str2 = "PDP";
        String str3 = new String("PDP");
        String str4 = new String("PDP");

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1==str3) = " + (str1 == str3));
        System.out.println("(str3==str4) = " + (str3 == str4));

        System.out.println("(str1==str3.intern()) = " +
                (str1 == str3.intern()));
        System.out.println("(str3.intern() == str4.intern()) = " +
                (str3.intern() == str4.intern()));

        System.out.println("\n *** equals ***");
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str4.equals(str3) = " + str4.equals(str3));

        System.out.println("str1.equals(\"pdp\") = " +
                str1.equals("pdp"));
        System.out.println("str1.equalsIgnoreCase(\"pdp\") = " +
                str1.equalsIgnoreCase("pdp"));

        System.out.println();

    }
}
