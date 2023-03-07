public class Task5 {
    public static void main(String[] args) {
        //5)	Uzunligi 1 dan uzun bo’lgan satr berilgan.Satrdagi sonlar yig’indisini topadigan metod yozing.
        //
        //  M-n:
        //  ("abc123xyz") => 123
        //     ("aa11b33") => 44
        //  ("7 11") =>18
        String str = "11 7 ";

        int sum = 0;
        String s = "0";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                s += str.charAt(i);
            } else {
                sum += Integer.parseInt(s);
                s = "0";
            }
        }
        sum += Integer.parseInt(s);
        System.out.println(sum);
    }

}
