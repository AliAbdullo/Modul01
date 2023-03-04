public class Dublicat {
    public static void main(String[] args) {

        //2 ta array uchun o'xshash qiymatlarni ko'rsating.

        int[] nums1 = {0,1,2,3,4,51};
        int[] nums2 = {1,5,9,7,36,6,4,2};

        commonValues(nums1, nums2);

    }
    static void commonValues(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common values: "+ arr1[i]);
                }
            }
        }
    }

}
