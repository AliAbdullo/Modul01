public class MaxMinArrays {
    public static void main(String[] args) {
        // Arraydagi maximum va minimum qiymatlarni toping.

        int[] nums1 = {0,1,2,3,4,51};
        int[] nums2 = {1,5,9,7,36,6,4,2};

        System.out.println("Nums2 ni maximali: "+ max(nums2));
    }
    static int max(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
/*            if (arr[i] > max){
                max=arr[i];
            }*/max= Math.max(arr[i],max );
        }
        return max;
    }
    static int min(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
