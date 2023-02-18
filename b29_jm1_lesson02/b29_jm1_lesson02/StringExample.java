public class StringExample {
    public static void main(String[] args) {
        // java.lang.String - fully qualified name
        String company = "Oracle";
        int len = company.length();
        System.out.println("len = " + len);

//        char firstLetter = company[0];
        char firstLetter = company.charAt(0);
        System.out.println("firstLetter = " + firstLetter);

        System.out.println();

        for (int i = 0; i < company.length(); i++) {
            System.out.println("company.charAt("+i+") = " + company.charAt(i));
        }

        // Ctrl+/, Ctrl+Shift+/ => comment/uncomment
        /*int number = 17;
        System.out.println(number+"number");
        System.out.println("number"+"number");*/
    }
}
