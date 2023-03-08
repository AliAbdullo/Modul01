import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        Object[] arr = {null, 10, true, 10.25d, "java", new Random(),
                new int[]{10, 20, 30}};

        int[] nums; //  =new int[-5];
        nums = new int[]{10, 20, 30, 40, 50, 60, 70};
        System.out.println("nums = " + Arrays.toString(nums));

        //nums = new int[5];
        int[] nums2 = Arrays.copyOf(nums, 5);
        System.out.println("nums = " + Arrays.toString(nums));

        Number[] numbers = new Double[5];
        numbers[1] = 15d;
        // numbers[3] = 15; // ArrayStoreException
        System.out.println("numbers = " + Arrays.toString(numbers));

        new Random().nextInt(101);
        new Random().nextInt(101);
        new Random().nextInt(101);
    }
}
