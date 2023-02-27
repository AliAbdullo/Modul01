public class AutoTypePromotion {
    public static void main(String[] args) {
        System.out.println(add((byte) 10, (byte) 20));

        byte n1 = 10;
        byte n2 = 15;
        int n3 = n1 + n2*'A'+45;
        long n4 = n1 + n2*'A'+45+0l;
        float n5 = n1 + n2*'A'+45+0f;
        // 'A'-'B' = -1
    }

//    private static byte add(byte a, byte b) {
//        System.out.println("add(byte, byte)");
//        return (byte) (a+b);
//    }

    // Auto type promotion
    private static double add(double a, double b) {
        System.out.println("add(double, double)");
        return a+b;
    }

    private static int add(int a, int b) {
        System.out.println("add(int, int)");
        return a+b;
    }
}
