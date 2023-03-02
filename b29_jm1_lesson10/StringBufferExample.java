public class  StringBufferExample {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer("Java");
        System.out.println("Емкость: " + strBuffer.capacity()); // 20
        System.out.println("strBuffer.length() = " + strBuffer.length());

        // newCapacity = 2 * oldCapacity + 2;

        strBuffer.append("aaaaaaaaaaaaaaaa").append("bbbb");
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("strBuffer.length() = " + strBuffer.length()); // 24

        strBuffer.ensureCapacity(152);
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4

        strBuffer.trimToSize();

        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4

        strBuffer.append("tttt");
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4

    }
}
