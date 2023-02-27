public class App7 {
    public static void main(String[] args) {
        String text = "c c++ java c# javascript python";
        String s1 = text.replace('c', 'C');
        System.out.println("s1 = " + s1);
        String s2 = text.replace("java", "JAVA");
        System.out.println("s2 = "+s2);

        String s3 = text.replaceAll("java", "JAVA");
        System.out.println("s3 = "+s3);

        String s4 = text.replaceFirst("java", "JAVA");
        System.out.println("s4 = "+s4);

        System.out.println();
        text = "Today is 27 of February in 2023";
        System.out.println("text = " + text);
        //String s5 = text.replaceAll("[0-9]", "NUMBER");
        //String s5 = text.replaceAll("[0-9]+", "NUMBER");
        //String s5 = text.replaceAll("[0-9]+", "");
        String s5 = text.replaceAll("\\d+", "");
        System.out.println("s5 = " + s5);

        System.out.println();
        text = "c c++ java c# javascript python";
        System.out.println("text = " + text);

        System.out.println("text.indexOf('j') = " + text.indexOf('j'));
        System.out.println("text.indexOf('j', 8) = " + text.indexOf('j', 8));
        System.out.println("text.indexOf('j', 18) = " + text.indexOf('j', 18));

        System.out.println();
        System.out.println("java".startsWith("J"));
        System.out.println("java".startsWith("t"));
        System.out.println("java".startsWith("a"));
        System.out.println("java".startsWith("a", 1));

        System.out.println();

        String s7 = "javascript";
        String s8 = "java";

        int compareTo = s7.compareTo(s8);
        System.out.println("compareTo = " + compareTo);
        System.out.println("s7.compareToIgnoreCase(s8) = " +
                s7.compareToIgnoreCase(s8));

        char c = 'A';
        String.valueOf(c); // "c"
        // ""+c;  // "c"
    }
}
