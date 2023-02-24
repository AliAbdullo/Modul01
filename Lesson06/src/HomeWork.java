public class HomeWork {
    public static void main(String[] args) {
//        System.out.println("fibo(10) = " + fibo(10));
//        show("Assalomu alaykum");
//        tip(8," salom");
//        System.out.println("add(8,9) = " + add(8, 9));
//        System.out.println("perim(2,3) = " + perim(2, 3));
/*        int a=5,b=8;
        System.out.println("ko " + multiple(a,b));*/
        System.out.println("TubSon(4) = " + TubSon(16));
    }

    private static boolean TubSon(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n %i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int multiple(int n, int m) {
        return n*m;
    }


    private static int perim(int a,int b) {
        return (a+b)*2 ;
    }

    private static int add(int a, int b) {
        return a+b;
    }

    private static void tip(int a,String b) {
        System.out.println(a + b);
    }

    private static void show(String word) {
        System.out.println(word);
    }

    private static int fibo(int n) {
        if (n > 1){
            return fibo(n-1)+fibo(n-2);
        }return n;
    }


}
