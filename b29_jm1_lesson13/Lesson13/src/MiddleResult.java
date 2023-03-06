public class MiddleResult {
    public static void main(String[] args) {

        // Array elementlarini o'rtacha qiymatini  topish.

        int[] nums1 = {0,1,2,3,4,51};
        int[] nums2 = {1,5,9,7,36,6,4,2};




        /*
        String[] words = {"Hello"," ","world!"};

        int [][] array = {{0,1,2,3},{4,5,6,0},{7,8,9,0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/

        double arrMiddle = middle(nums1);
        double arrMiddle2 = middle(nums2);

        System.out.println("Nums1= "+ arrMiddle);
        System.out.println("Nums2= "+ arrMiddle2);


    }
    static double middle(int[] arr){
        int len = arr.length;
        double result=0;

        for (int i = 0; i < len; i++) {
            result += arr[i];
        }
        result /= len;
        return result;
    }
}
