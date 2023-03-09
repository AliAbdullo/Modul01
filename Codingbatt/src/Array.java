public class Array {
    public static void main(String[] args) {

        int[] massiv = {4, 9, 5};
        int[] massiv2 = {9, 4, 9, 8, 4};
//        System.out.println(max(massiv2));

        min(massiv2);

    }

    /*    public static int max(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }*/
    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
