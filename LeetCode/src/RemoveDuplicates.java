public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 4, 5, 6, 7};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int k = nums.length;
        int n = 0;
        for (int i = 1; i < k; i++) {
            if (nums[i] != nums[n]) {
                n++;
                nums[n] = nums[i];
            }
        }
        return n + 1;
    }
}
