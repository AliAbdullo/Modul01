public class Answer34 {
    public static void main(String[] args) {
        small(24, 45, 12);
        System.out.println(Tub(4));
        ;
    }

//4
    public static boolean Tub(int num1) {
        int count = 0;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) count++;
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

//3
    private static void small(int n1, int n2, int n3) {

        if (n1 > n2 && n2 < n3) {
            System.out.println(n2);
        }
        if (n1 < n2 && n1 < n3) {
            System.out.println(n2);
        }
        ;
        if (n1 > n3 && n2 > n3) {
            System.out.println(n3);
        }
        ;
    }


}
