public class DRYprinsple {
    public static void main(String[] args) {

        sum(12, 45);
        avarage(12, 45);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.printf("sun = %d %n", sum);
        return sum;
    }

    public static int avarage(int a, int b) {

        return sum(a, b) / 2;
    }

    public static int princeOfBread(int price, int bread) {
        int sum = price * bread;
        System.out.printf("%d breads $%d %n", bread, sum);
        return sum;
    }

    public static int distributionFriends(int price, int bread) {
        int friends = 4;
        return princeOfBread(price, bread) / friends;
    }
}
