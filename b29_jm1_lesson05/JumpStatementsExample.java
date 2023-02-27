public class JumpStatementsExample {

    public static void main(String[] args) {
        // break, continue, return

        int a = 100;

        label:
        {
            int b = 200;
            System.out.println("a = " + a);

            if(b > 150) break label;

            System.out.println("b = " + b);
        }

        label:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                //if(j > 3) break;
                //if(j > 3) continue;
                //if (j > 3) break label;
                if (j > 3) continue label;
                System.out.println("i = " + i + " j = " + j);
            }
            // code
        }

        // code

        /*for (int i = 1; i <= 10; i++) {
            //if(i == 5) continue;
            if(i == 5) return;
            System.out.println(i);
            // 50 row code
        }

        System.out.println("***");

        for (int i = 1; i <= 10; i++) {
            if(i == 5) break;
            System.out.println(i);
            // 50 row code
        }*/


        // System.exit(0);

        // System.out.println("abc");
        // method();
        // System.out.println("def");
    }

    private static int method() {
        System.out.println("called method");
//        System.out.println(10.0/0);
//        int[] arr = {10, 20, 30};
//        System.out.println(arr[5]);
//        System.exit(0);
        return 200;
    }
}
