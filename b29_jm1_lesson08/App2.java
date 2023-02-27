public class App2 {
    public static void main(String[] args) {
        //substring, concat, trim, length, repeat, join, isEmpty, isBlank
        String text = "c c++ java c# javascript python";
        System.out.println("text = " + text);
        System.out.println("text.length() = " + text.length());


        String s1 = text.substring(6);
        System.out.println("s1 = " + s1);

        String s2 = text.substring(6, 10); // 6-inclusive, 10-exclusive
        System.out.println("s2 = " + s2);

        String s3 = text.substring(14, 24);
        System.out.println("s3 = " + s3);

        s2 = s2.concat(s3);
        System.out.println("s2 = " + s2);

        String fullName = "   Eshmatov    Toshmat    ";
        String fullName2 = "Eshmatov    Toshma";
        System.out.println("fullName = " + fullName);
        System.out.println("fullName.trim() = " + fullName.trim());

        String b29 = "b29".repeat(5);
        System.out.println("b29 = " + b29);

        // white space
        String region = "   ";
        System.out.println("region.isEmpty() = " +
                region.isEmpty());
        System.out.println("region.trim().isEmpty() = " +
                region.trim().isEmpty());
        System.out.println("region.isBlank() = " +
                region.isBlank());
    }
}
