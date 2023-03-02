public class StringBufferExample2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        char c = sb.charAt(0); // J
        System.out.println(c);
        sb.setCharAt(2, Character.toUpperCase(sb.charAt(2)));
        System.out.println(sb.toString());
        System.out.println("sb = " + sb);

        sb.append(" backend");
        System.out.println("sb = " + sb);

        sb.insert(0, "b29");    // Qayerdan qaysi elementni joylashni ko'rsatadi
        sb.insert(sb.length(), "b29");
        sb.insert(8, "b29 ");
        System.out.println("sb = " + sb);

        sb.deleteCharAt(5);
        System.out.println("sb = " + sb);

        sb.delete(3, 3+7);
        System.out.println("sb = " + sb);

        String sub = sb.substring(4, 4 + 7);
        System.out.println("sub = " + sub);
        System.out.println("sb = " + sb);

        sb.setLength(25);
        System.out.println("sb = " + sb);

        sb.append("oop");
        System.out.println("sb = " + sb);

        sb.setLength(11);
        System.out.println("sb = " + sb);

        sb.replace(4, 4+4, "front");
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        String text = "quduq";
        String reverse = new StringBuffer(text).reverse().toString();

        System.out.println(new StringBuffer(text).reverse().toString().equals(text));
    }
}
